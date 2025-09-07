package com.chiksmedina.solar.broken.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.EssentionalUiGroup

val EssentionalUiGroup.PostsCarouselHorizontal: ImageVector
    get() {
        if (_postsCarouselHorizontal != null) {
            return _postsCarouselHorizontal!!
        }
        _postsCarouselHorizontal = Builder(
            name = "PostsCarouselHorizontal", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 19.0f)
                horizontalLineTo(21.5f)
                curveTo(20.1193f, 19.0f, 19.0f, 17.8807f, 19.0f, 16.5f)
                lineTo(19.0f, 7.5f)
                curveTo(19.0f, 6.1193f, 20.1193f, 5.0f, 21.5f, 5.0f)
                lineTo(22.0f, 5.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(2.0f, 19.0f)
                horizontalLineTo(2.5f)
                curveTo(3.8807f, 19.0f, 5.0f, 17.8807f, 5.0f, 16.5f)
                lineTo(5.0f, 7.5f)
                curveTo(5.0f, 6.1193f, 3.8807f, 5.0f, 2.5f, 5.0f)
                lineTo(2.0f, 5.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.9998f, 5.1258f)
                curveTo(15.387f, 5.2101f, 15.6792f, 5.3507f, 15.914f, 5.5855f)
                curveTo(16.4998f, 6.1713f, 16.4998f, 7.1141f, 16.4998f, 8.9998f)
                lineTo(16.4998f, 14.9998f)
                curveTo(16.4998f, 16.8854f, 16.4998f, 17.8282f, 15.914f, 18.414f)
                curveTo(15.3282f, 18.9998f, 14.3854f, 18.9998f, 12.4998f, 18.9998f)
                lineTo(11.4998f, 18.9998f)
                curveTo(9.6141f, 18.9998f, 8.6713f, 18.9998f, 8.0855f, 18.414f)
                curveTo(7.4998f, 17.8282f, 7.4998f, 16.8854f, 7.4998f, 14.9998f)
                lineTo(7.4998f, 8.9998f)
                curveTo(7.4998f, 7.1141f, 7.4998f, 6.1713f, 8.0855f, 5.5855f)
                curveTo(8.6171f, 5.054f, 9.4426f, 5.0048f, 10.9998f, 5.0002f)
            }
        }
            .build()
        return _postsCarouselHorizontal!!
    }

private var _postsCarouselHorizontal: ImageVector? = null
