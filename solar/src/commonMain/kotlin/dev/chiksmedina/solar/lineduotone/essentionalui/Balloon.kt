package dev.chiksmedina.solar.lineduotone.essentionalui

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.lineduotone.EssentionalUiGroup

val EssentionalUiGroup.Balloon: ImageVector
    get() {
        if (_balloon != null) {
            return _balloon!!
        }
        _balloon = Builder(
            name = "Balloon", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.9395f, 17.5002f)
                curveTo(16.0815f, 17.5337f, 19.5332f, 13.7028f, 19.4998f, 9.5608f)
                curveTo(19.4663f, 5.4188f, 16.0815f, 2.0339f, 11.9395f, 2.0005f)
                curveTo(7.7975f, 1.9671f, 4.4668f, 5.2977f, 4.5002f, 9.4397f)
                curveTo(4.5337f, 13.5817f, 7.7975f, 17.4668f, 11.9395f, 17.5002f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 9.0f)
                curveTo(15.4867f, 7.3564f, 14.1436f, 6.0133f, 12.5f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 19.8502f)
                curveTo(12.3212f, 19.8502f, 12.4818f, 19.8502f, 12.5933f, 19.8283f)
                curveTo(13.2466f, 19.6998f, 13.6441f, 19.0557f, 13.4511f, 18.4384f)
                curveTo(13.4181f, 18.333f, 13.342f, 18.1962f, 13.1896f, 17.9227f)
                moveTo(12.0f, 19.8502f)
                curveTo(11.6788f, 19.8502f, 11.5182f, 19.8502f, 11.4067f, 19.8283f)
                curveTo(10.7534f, 19.6998f, 10.3559f, 19.0557f, 10.5489f, 18.4384f)
                curveTo(10.5819f, 18.333f, 10.658f, 18.1962f, 10.8104f, 17.9227f)
                moveTo(12.0f, 19.8502f)
                verticalLineTo(22.0f)
            }
        }
            .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
