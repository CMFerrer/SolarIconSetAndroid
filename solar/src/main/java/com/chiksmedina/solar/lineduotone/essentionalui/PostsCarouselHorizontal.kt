package com.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.EssentionalUiGroup

public val EssentionalUiGroup.PostsCarouselHorizontal: ImageVector
    get() {
        if (_postsCarouselHorizontal != null) {
            return _postsCarouselHorizontal!!
        }
        _postsCarouselHorizontal = Builder(name = "PostsCarouselHorizontal", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 5.0f)
                curveTo(14.3856f, 5.0f, 15.3284f, 5.0f, 15.9142f, 5.5858f)
                curveTo(16.5f, 6.1716f, 16.5f, 7.1144f, 16.5f, 9.0f)
                verticalLineTo(15.0f)
                curveTo(16.5f, 16.8856f, 16.5f, 17.8284f, 15.9142f, 18.4142f)
                curveTo(15.3284f, 19.0f, 14.3856f, 19.0f, 12.5f, 19.0f)
                horizontalLineTo(11.5f)
                curveTo(9.6144f, 19.0f, 8.6716f, 19.0f, 8.0858f, 18.4142f)
                curveTo(7.5f, 17.8284f, 7.5f, 16.8856f, 7.5f, 15.0f)
                lineTo(7.5f, 9.0f)
                curveTo(7.5f, 7.1144f, 7.5f, 6.1716f, 8.0858f, 5.5858f)
                curveTo(8.6716f, 5.0f, 9.6144f, 5.0f, 11.5f, 5.0f)
                lineTo(12.5f, 5.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(22.0f, 19.0f)
                horizontalLineTo(21.5f)
                curveTo(20.1193f, 19.0f, 19.0f, 17.8807f, 19.0f, 16.5f)
                lineTo(19.0f, 7.5f)
                curveTo(19.0f, 6.1193f, 20.1193f, 5.0f, 21.5f, 5.0f)
                lineTo(22.0f, 5.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(2.0f, 19.0f)
                horizontalLineTo(2.5f)
                curveTo(3.8807f, 19.0f, 5.0f, 17.8807f, 5.0f, 16.5f)
                lineTo(5.0f, 7.5f)
                curveTo(5.0f, 6.1193f, 3.8807f, 5.0f, 2.5f, 5.0f)
                lineTo(2.0f, 5.0f)
            }
        }
        .build()
        return _postsCarouselHorizontal!!
    }

private var _postsCarouselHorizontal: ImageVector? = null
