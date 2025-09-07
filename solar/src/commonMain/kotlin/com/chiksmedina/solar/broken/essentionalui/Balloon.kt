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
                moveTo(8.0001f, 16.6065f)
                curveTo(9.1493f, 17.4664f, 10.5185f, 17.9874f, 12.0f, 17.9997f)
                curveTo(16.142f, 18.0342f, 19.5937f, 14.0798f, 19.5603f, 9.8042f)
                curveTo(19.5268f, 5.5287f, 16.142f, 2.0347f, 12.0f, 2.0002f)
                curveTo(7.858f, 1.9657f, 4.5273f, 5.4037f, 4.5608f, 9.6793f)
                curveTo(4.5698f, 10.8295f, 4.8125f, 11.9604f, 5.2433f, 13.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(15.5f, 9.0f)
                curveTo(15.4867f, 7.3564f, 14.1436f, 6.0133f, 12.5f, 6.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.3502f)
                curveTo(12.3212f, 20.3502f, 12.4818f, 20.3502f, 12.5933f, 20.3283f)
                curveTo(13.2466f, 20.1999f, 13.6441f, 19.5557f, 13.4511f, 18.9384f)
                curveTo(13.4181f, 18.833f, 13.342f, 18.6962f, 13.1896f, 18.4227f)
                moveTo(12.0f, 20.3502f)
                curveTo(11.6788f, 20.3502f, 11.5182f, 20.3502f, 11.4067f, 20.3283f)
                curveTo(10.7534f, 20.1999f, 10.3559f, 19.5557f, 10.5489f, 18.9384f)
                curveTo(10.5819f, 18.833f, 10.658f, 18.6962f, 10.8104f, 18.4227f)
                moveTo(12.0f, 20.3502f)
                verticalLineTo(22.5f)
            }
        }
            .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
