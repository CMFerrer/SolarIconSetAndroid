package dev.chiksmedina.solar.boldduotone.essentionalui

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
import dev.chiksmedina.solar.boldduotone.EssentionalUiGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 17.9998f)
                curveTo(16.142f, 18.0343f, 19.5937f, 14.0798f, 19.5603f, 9.8043f)
                curveTo(19.5268f, 5.5287f, 16.142f, 2.0348f, 12.0f, 2.0003f)
                curveTo(7.858f, 1.9658f, 4.5273f, 5.4038f, 4.5608f, 9.6794f)
                curveTo(4.5942f, 13.9549f, 7.858f, 17.9653f, 12.0f, 17.9998f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.75f, 5.9939f)
                curveTo(11.7534f, 5.5798f, 12.0919f, 5.2467f, 12.5061f, 5.25f)
                curveTo(14.5591f, 5.2666f, 16.2334f, 6.9409f, 16.25f, 8.9939f)
                curveTo(16.2533f, 9.4081f, 15.9203f, 9.7466f, 15.5061f, 9.75f)
                curveTo(15.0919f, 9.7533f, 14.7534f, 9.4202f, 14.75f, 9.0061f)
                curveTo(14.7401f, 7.7719f, 13.7281f, 6.7599f, 12.4939f, 6.75f)
                curveTo(12.0797f, 6.7466f, 11.7467f, 6.4082f, 11.75f, 5.9939f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(13.1801f, 17.9011f)
                curveTo(12.7949f, 17.9691f, 12.4007f, 18.0031f, 12.0f, 17.9998f)
                curveTo(11.6006f, 17.9964f, 11.2094f, 17.9561f, 10.8284f, 17.8822f)
                lineTo(10.8104f, 17.9223f)
                curveTo(10.6581f, 18.1959f, 10.5819f, 18.3327f, 10.5489f, 18.4381f)
                curveTo(10.3559f, 19.0553f, 10.7534f, 19.6995f, 11.4067f, 19.8279f)
                curveTo(11.5182f, 19.8499f, 11.6788f, 19.8499f, 12.0f, 19.8499f)
                curveTo(12.3211f, 19.8499f, 12.4818f, 19.8499f, 12.5933f, 19.8279f)
                curveTo(13.2466f, 19.6995f, 13.6441f, 19.0553f, 13.4511f, 18.4381f)
                curveTo(13.4181f, 18.3327f, 13.342f, 18.1959f, 13.1896f, 17.9223f)
                lineTo(13.1801f, 17.9011f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(11.25f, 19.7859f)
                curveTo(11.3004f, 19.8033f, 11.3526f, 19.8174f, 11.4067f, 19.828f)
                curveTo(11.5182f, 19.85f, 11.6788f, 19.85f, 12.0f, 19.85f)
                curveTo(12.3211f, 19.85f, 12.4818f, 19.85f, 12.5933f, 19.828f)
                curveTo(12.6474f, 19.8174f, 12.6996f, 19.8033f, 12.75f, 19.7859f)
                verticalLineTo(21.25f)
                curveTo(12.75f, 21.6642f, 12.4142f, 22.0f, 12.0f, 22.0f)
                curveTo(11.5858f, 22.0f, 11.25f, 21.6642f, 11.25f, 21.25f)
                verticalLineTo(19.7859f)
                close()
            }
        }
            .build()
        return _balloon!!
    }

private var _balloon: ImageVector? = null
