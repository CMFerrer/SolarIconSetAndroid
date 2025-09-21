package dev.chiksmedina.solar.boldduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

val EssentionalUiGroup.PostsCarouselVertical: ImageVector
    get() {
        if (_postsCarouselVertical != null) {
            return _postsCarouselVertical!!
        }
        _postsCarouselVertical = Builder(
            name = "PostsCarouselVertical", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 5.5f)
                horizontalLineTo(16.0f)
                curveTo(17.6569f, 5.5f, 19.0f, 4.1568f, 19.0f, 2.5f)
                curveTo(19.0f, 2.2239f, 18.7761f, 2.0f, 18.5f, 2.0f)
                horizontalLineTo(5.5f)
                curveTo(5.2239f, 2.0f, 5.0f, 2.2239f, 5.0f, 2.5f)
                curveTo(5.0f, 4.1568f, 6.3432f, 5.5f, 8.0f, 5.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.0f, 18.5f)
                horizontalLineTo(8.0f)
                curveTo(6.3432f, 18.5f, 5.0f, 19.8431f, 5.0f, 21.5f)
                curveTo(5.0f, 21.7761f, 5.2239f, 22.0f, 5.5f, 22.0f)
                lineTo(18.5f, 22.0f)
                curveTo(18.7761f, 22.0f, 19.0f, 21.7761f, 19.0f, 21.5f)
                curveTo(19.0f, 19.8431f, 17.6569f, 18.5f, 16.0f, 18.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.0f, 11.5f)
                curveTo(5.0f, 9.6144f, 5.0f, 8.6716f, 5.5858f, 8.0858f)
                curveTo(6.1716f, 7.5f, 7.1144f, 7.5f, 9.0f, 7.5f)
                horizontalLineTo(15.0f)
                curveTo(16.8856f, 7.5f, 17.8284f, 7.5f, 18.4142f, 8.0858f)
                curveTo(19.0f, 8.6716f, 19.0f, 9.6144f, 19.0f, 11.5f)
                verticalLineTo(12.5f)
                curveTo(19.0f, 14.3856f, 19.0f, 15.3284f, 18.4142f, 15.9142f)
                curveTo(17.8284f, 16.5f, 16.8856f, 16.5f, 15.0f, 16.5f)
                horizontalLineTo(9.0f)
                curveTo(7.1144f, 16.5f, 6.1716f, 16.5f, 5.5858f, 15.9142f)
                curveTo(5.0f, 15.3284f, 5.0f, 14.3856f, 5.0f, 12.5f)
                verticalLineTo(11.5f)
                close()
            }
        }
            .build()
        return _postsCarouselVertical!!
    }

private var _postsCarouselVertical: ImageVector? = null
