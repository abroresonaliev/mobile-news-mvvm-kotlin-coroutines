package uz.icerbersoft.mobilenews.presentation.presentation.detail.di

import dagger.Component
import uz.icerbersoft.mobilenews.presentation.global.di.GlobalDaggerComponent
import uz.icerbersoft.mobilenews.presentation.presentation.detail.ArticleDetailFragment

@ArticleDetailDaggerScope
@Component(
    dependencies = [GlobalDaggerComponent::class],
    modules = [ArticleDetailDaggerModule::class]
)
internal interface ArticleDetailDaggerComponent {

    fun inject(fragment: ArticleDetailFragment)

    @Component.Factory
    interface Factory {
        fun create(component: GlobalDaggerComponent): ArticleDetailDaggerComponent
    }

    companion object {
        fun create(component: GlobalDaggerComponent): ArticleDetailDaggerComponent =
            DaggerArticleDetailDaggerComponent
                .factory()
                .create(component)
    }
}