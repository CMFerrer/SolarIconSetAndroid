package com.chiksmedina.solar.bold.networkitprogramming

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
import com.chiksmedina.solar.bold.NetworkItProgrammingGroup

val NetworkItProgrammingGroup.HashtagChat: ImageVector
    get() {
        if (_hashtagChat != null) {
            return _hashtagChat!!
        }
        _hashtagChat = Builder(
            name = "HashtagChat", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(17.8144f, 21.2359f)
                lineTo(17.5433f, 21.6938f)
                curveTo(17.3017f, 22.102f, 16.6982f, 22.102f, 16.4567f, 21.6938f)
                lineTo(16.1856f, 21.2359f)
                curveTo(15.9754f, 20.8807f, 15.8702f, 20.7031f, 15.7014f, 20.6049f)
                curveTo(15.5325f, 20.5067f, 15.32f, 20.503f, 14.8948f, 20.4957f)
                curveTo(14.2671f, 20.4849f, 13.8734f, 20.4464f, 13.5433f, 20.3097f)
                curveTo(12.9307f, 20.0559f, 12.444f, 19.5693f, 12.1903f, 18.9567f)
                curveTo(12.0f, 18.4973f, 12.0f, 17.9148f, 12.0f, 16.75f)
                verticalLineTo(16.25f)
                curveTo(12.0f, 14.6132f, 12.0f, 13.7949f, 12.3684f, 13.1937f)
                curveTo(12.5745f, 12.8573f, 12.8574f, 12.5745f, 13.1938f, 12.3683f)
                curveTo(13.7949f, 11.9999f, 14.6133f, 11.9999f, 16.25f, 11.9999f)
                horizontalLineTo(17.75f)
                curveTo(19.3867f, 11.9999f, 20.2051f, 11.9999f, 20.8062f, 12.3683f)
                curveTo(21.1426f, 12.5745f, 21.4255f, 12.8573f, 21.6316f, 13.1937f)
                curveTo(22.0f, 13.7949f, 22.0f, 14.6132f, 22.0f, 16.25f)
                verticalLineTo(16.75f)
                curveTo(22.0f, 17.9148f, 22.0f, 18.4973f, 21.8097f, 18.9567f)
                curveTo(21.556f, 19.5693f, 21.0693f, 20.0559f, 20.4567f, 20.3097f)
                curveTo(20.1266f, 20.4464f, 19.7329f, 20.4849f, 19.1052f, 20.4957f)
                curveTo(18.68f, 20.503f, 18.4674f, 20.5067f, 18.2986f, 20.6049f)
                curveTo(18.1297f, 20.7031f, 18.0246f, 20.8807f, 17.8144f, 21.2359f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(10.2007f, 2.2773f)
                curveTo(10.5998f, 2.3882f, 10.8335f, 2.8016f, 10.7226f, 3.2007f)
                lineTo(9.3201f, 8.25f)
                horizontalLineTo(16.7633f)
                lineTo(18.2774f, 2.7992f)
                curveTo(18.3882f, 2.4001f, 18.8016f, 2.1665f, 19.2007f, 2.2773f)
                curveTo(19.5998f, 2.3882f, 19.8335f, 2.8016f, 19.7226f, 3.2007f)
                lineTo(18.3201f, 8.25f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 8.25f, 22.75f, 8.5857f, 22.75f, 9.0f)
                curveTo(22.75f, 9.4142f, 22.4142f, 9.75f, 22.0f, 9.75f)
                horizontalLineTo(17.9016f)
                curveTo(17.7716f, 10.1188f, 17.3761f, 10.3288f, 16.9937f, 10.2226f)
                curveTo(16.7488f, 10.1546f, 16.5662f, 9.9726f, 16.4873f, 9.75f)
                horizontalLineTo(8.9034f)
                lineTo(7.3756f, 15.2499f)
                horizontalLineTo(9.0f)
                curveTo(9.4142f, 15.2499f, 9.75f, 15.5857f, 9.75f, 15.9999f)
                curveTo(9.75f, 16.4142f, 9.4142f, 16.7499f, 9.0f, 16.7499f)
                horizontalLineTo(6.959f)
                lineTo(5.7226f, 21.2007f)
                curveTo(5.6118f, 21.5998f, 5.1984f, 21.8334f, 4.7993f, 21.7226f)
                curveTo(4.4002f, 21.6117f, 4.1665f, 21.1983f, 4.2774f, 20.7992f)
                lineTo(5.4022f, 16.7499f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 16.7499f, 1.25f, 16.4142f, 1.25f, 15.9999f)
                curveTo(1.25f, 15.5857f, 1.5858f, 15.2499f, 2.0f, 15.2499f)
                horizontalLineTo(5.8188f)
                lineTo(7.3466f, 9.75f)
                horizontalLineTo(4.0f)
                curveTo(3.5858f, 9.75f, 3.25f, 9.4142f, 3.25f, 9.0f)
                curveTo(3.25f, 8.5857f, 3.5858f, 8.25f, 4.0f, 8.25f)
                horizontalLineTo(7.7633f)
                lineTo(9.2774f, 2.7992f)
                curveTo(9.3882f, 2.4001f, 9.8016f, 2.1665f, 10.2007f, 2.2773f)
                close()
            }
        }
            .build()
        return _hashtagChat!!
    }

private var _hashtagChat: ImageVector? = null
