package dev.chiksmedina.solar.outline.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.EssentionalUiGroup

val EssentionalUiGroup.Waterdrop: ImageVector
    get() {
        if (_waterdrop != null) {
            return _waterdrop!!
        }
        _waterdrop = Builder(
            name = "Waterdrop", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(11.7006f, 6.9571f)
                curveTo(12.0766f, 6.7832f, 12.2404f, 6.3375f, 12.0665f, 5.9616f)
                curveTo(11.8927f, 5.5856f, 11.447f, 5.4218f, 11.071f, 5.5956f)
                curveTo(9.1061f, 6.5043f, 7.5917f, 8.3111f, 6.8997f, 10.4974f)
                curveTo(6.7747f, 10.8923f, 6.9935f, 11.3138f, 7.3884f, 11.4388f)
                curveTo(7.7833f, 11.5638f, 8.2048f, 11.345f, 8.3298f, 10.9501f)
                curveTo(8.9073f, 9.1255f, 10.1551f, 7.6718f, 11.7006f, 6.9571f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.3856f, 1.7286f)
                curveTo(12.8568f, 1.0905f, 11.1432f, 1.0905f, 9.6144f, 1.7286f)
                curveTo(5.1533f, 3.5909f, 2.25f, 8.0216f, 2.25f, 12.9281f)
                verticalLineTo(13.1928f)
                curveTo(2.25f, 18.4551f, 6.4255f, 22.75f, 11.6115f, 22.75f)
                horizontalLineTo(12.3885f)
                curveTo(17.5745f, 22.75f, 21.75f, 18.4551f, 21.75f, 13.1928f)
                verticalLineTo(12.9281f)
                curveTo(21.75f, 8.0216f, 18.8467f, 3.5909f, 14.3856f, 1.7286f)
                close()
                moveTo(10.1922f, 3.1129f)
                curveTo(11.3513f, 2.629f, 12.6487f, 2.629f, 13.8078f, 3.1129f)
                curveTo(17.6962f, 4.7361f, 20.25f, 8.6114f, 20.25f, 12.9281f)
                verticalLineTo(13.1928f)
                curveTo(20.25f, 17.6587f, 16.7145f, 21.25f, 12.3885f, 21.25f)
                horizontalLineTo(11.6115f)
                curveTo(7.2855f, 21.25f, 3.75f, 17.6587f, 3.75f, 13.1928f)
                verticalLineTo(12.9281f)
                curveTo(3.75f, 8.6114f, 6.3038f, 4.7361f, 10.1922f, 3.1129f)
                close()
            }
        }
            .build()
        return _waterdrop!!
    }

private var _waterdrop: ImageVector? = null
