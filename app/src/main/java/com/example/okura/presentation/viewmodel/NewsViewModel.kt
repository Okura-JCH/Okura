import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.okura.domain.data.repository.NewsRepository
import com.example.okura.domain.model.NewsItem
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class NewsViewModel(private val newsRepository: NewsRepository) : ViewModel() {
    private val _articles = MutableStateFlow<List<NewsItem>>(emptyList())
    val articles: StateFlow<List<NewsItem>> = _articles

    init {
        fetchArticles()
    }

    private fun fetchArticles() {
        viewModelScope.launch {
            val articlesFromApi = newsRepository.getArticles()
            _articles.value = articlesFromApi
        }
    }
}
