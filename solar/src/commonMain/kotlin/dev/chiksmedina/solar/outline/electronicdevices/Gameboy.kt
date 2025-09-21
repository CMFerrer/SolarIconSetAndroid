package dev.chiksmedina.solar.outline.electronicdevices

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
import dev.chiksmedina.solar.outline.ElectronicDevicesGroup

val ElectronicDevicesGroup.Gameboy: ImageVector
    get() {
        if (_gameboy != null) {
            return _gameboy!!
        }
        _gameboy = Builder(
            name = "Gameboy", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(11.9375f, 1.25f)
                horizontalLineTo(12.0625f)
                curveTo(14.1308f, 1.25f, 15.7678f, 1.25f, 17.0485f, 1.4413f)
                curveTo(18.3725f, 1.6391f, 19.4223f, 2.0548f, 20.2395f, 2.9627f)
                curveTo(21.0464f, 3.8594f, 21.4066f, 4.9922f, 21.5798f, 6.4236f)
                curveTo(21.75f, 7.8301f, 21.75f, 9.635f, 21.75f, 11.9478f)
                verticalLineTo(12.0522f)
                curveTo(21.75f, 14.365f, 21.75f, 16.1699f, 21.5798f, 17.5765f)
                curveTo(21.4066f, 19.0078f, 21.0464f, 20.1406f, 20.2395f, 21.0373f)
                curveTo(19.4223f, 21.9452f, 18.3725f, 22.3609f, 17.0485f, 22.5587f)
                curveTo(15.7678f, 22.75f, 14.1308f, 22.75f, 12.0625f, 22.75f)
                horizontalLineTo(11.9375f)
                curveTo(9.8692f, 22.75f, 8.2322f, 22.75f, 6.9515f, 22.5587f)
                curveTo(5.6275f, 22.3609f, 4.5777f, 21.9452f, 3.7606f, 21.0373f)
                curveTo(2.9536f, 20.1406f, 2.5934f, 19.0078f, 2.4202f, 17.5765f)
                curveTo(2.25f, 16.1699f, 2.25f, 14.365f, 2.25f, 12.0522f)
                verticalLineTo(11.9478f)
                curveTo(2.25f, 9.635f, 2.25f, 7.8301f, 2.4202f, 6.4236f)
                curveTo(2.5934f, 4.9922f, 2.9536f, 3.8594f, 3.7606f, 2.9627f)
                curveTo(4.5777f, 2.0548f, 5.6275f, 1.6391f, 6.9515f, 1.4413f)
                curveTo(8.2322f, 1.25f, 9.8692f, 1.25f, 11.9375f, 1.25f)
                close()
                moveTo(7.1731f, 2.9248f)
                curveTo(6.0463f, 3.0932f, 5.3764f, 3.4097f, 4.8755f, 3.9662f)
                curveTo(4.3644f, 4.534f, 4.0656f, 5.3119f, 3.9093f, 6.6037f)
                curveTo(3.7513f, 7.9097f, 3.75f, 9.6238f, 3.75f, 12.0f)
                curveTo(3.75f, 14.3762f, 3.7513f, 16.0903f, 3.9093f, 17.3963f)
                curveTo(4.0656f, 18.6881f, 4.3644f, 19.466f, 4.8755f, 20.0338f)
                curveTo(5.3764f, 20.5903f, 6.0463f, 20.9068f, 7.1731f, 21.0752f)
                curveTo(8.3303f, 21.248f, 9.8552f, 21.25f, 12.0f, 21.25f)
                curveTo(14.1448f, 21.25f, 15.6697f, 21.248f, 16.8269f, 21.0752f)
                curveTo(17.9537f, 20.9068f, 18.6236f, 20.5903f, 19.1245f, 20.0338f)
                curveTo(19.6356f, 19.466f, 19.9344f, 18.6881f, 20.0907f, 17.3963f)
                curveTo(20.2487f, 16.0903f, 20.25f, 14.3762f, 20.25f, 12.0f)
                curveTo(20.25f, 9.6238f, 20.2487f, 7.9097f, 20.0907f, 6.6037f)
                curveTo(19.9344f, 5.3119f, 19.6356f, 4.534f, 19.1245f, 3.9662f)
                curveTo(18.6236f, 3.4097f, 17.9537f, 3.0932f, 16.8269f, 2.9248f)
                curveTo(15.6697f, 2.752f, 14.1448f, 2.75f, 12.0f, 2.75f)
                curveTo(9.8552f, 2.75f, 8.3303f, 2.752f, 7.1731f, 2.9248f)
                close()
                moveTo(8.9161f, 5.2499f)
                curveTo(8.9438f, 5.25f, 8.9718f, 5.25f, 9.0f, 5.25f)
                horizontalLineTo(15.0f)
                curveTo(15.0282f, 5.25f, 15.0562f, 5.25f, 15.0839f, 5.2499f)
                curveTo(15.4647f, 5.2495f, 15.7932f, 5.2492f, 16.0823f, 5.3267f)
                curveTo(16.8588f, 5.5347f, 17.4653f, 6.1412f, 17.6733f, 6.9177f)
                curveTo(17.7508f, 7.2068f, 17.7505f, 7.5353f, 17.7501f, 7.9161f)
                curveTo(17.75f, 7.9438f, 17.75f, 7.9718f, 17.75f, 8.0f)
                curveTo(17.75f, 8.0282f, 17.75f, 8.0562f, 17.7501f, 8.0839f)
                curveTo(17.7505f, 8.4647f, 17.7508f, 8.7932f, 17.6733f, 9.0823f)
                curveTo(17.4653f, 9.8588f, 16.8588f, 10.4653f, 16.0823f, 10.6733f)
                curveTo(15.7932f, 10.7508f, 15.4647f, 10.7505f, 15.0839f, 10.7501f)
                curveTo(15.0562f, 10.75f, 15.0282f, 10.75f, 15.0f, 10.75f)
                horizontalLineTo(9.0f)
                curveTo(8.9718f, 10.75f, 8.9438f, 10.75f, 8.9161f, 10.7501f)
                curveTo(8.5353f, 10.7505f, 8.2068f, 10.7508f, 7.9177f, 10.6733f)
                curveTo(7.1412f, 10.4653f, 6.5347f, 9.8588f, 6.3267f, 9.0823f)
                curveTo(6.2492f, 8.7932f, 6.2495f, 8.4647f, 6.2499f, 8.0839f)
                curveTo(6.25f, 8.0562f, 6.25f, 8.0282f, 6.25f, 8.0f)
                curveTo(6.25f, 7.9718f, 6.25f, 7.9438f, 6.2499f, 7.9161f)
                curveTo(6.2495f, 7.5353f, 6.2492f, 7.2068f, 6.3267f, 6.9177f)
                curveTo(6.5347f, 6.1412f, 7.1412f, 5.5347f, 7.9177f, 5.3267f)
                curveTo(8.2068f, 5.2492f, 8.5353f, 5.2495f, 8.9161f, 5.2499f)
                close()
                moveTo(9.0f, 6.75f)
                curveTo(8.4867f, 6.75f, 8.3772f, 6.7564f, 8.3059f, 6.7756f)
                curveTo(8.0471f, 6.8449f, 7.8449f, 7.0471f, 7.7756f, 7.3059f)
                curveTo(7.7564f, 7.3772f, 7.75f, 7.4867f, 7.75f, 8.0f)
                curveTo(7.75f, 8.5133f, 7.7564f, 8.6228f, 7.7756f, 8.6941f)
                curveTo(7.8449f, 8.9529f, 8.0471f, 9.1551f, 8.3059f, 9.2245f)
                curveTo(8.3772f, 9.2436f, 8.4867f, 9.25f, 9.0f, 9.25f)
                horizontalLineTo(15.0f)
                curveTo(15.5133f, 9.25f, 15.6228f, 9.2436f, 15.6941f, 9.2245f)
                curveTo(15.9529f, 9.1551f, 16.1551f, 8.9529f, 16.2244f, 8.6941f)
                curveTo(16.2436f, 8.6228f, 16.25f, 8.5133f, 16.25f, 8.0f)
                curveTo(16.25f, 7.4867f, 16.2436f, 7.3772f, 16.2244f, 7.3059f)
                curveTo(16.1551f, 7.0471f, 15.9529f, 6.8449f, 15.6941f, 6.7756f)
                curveTo(15.6228f, 6.7564f, 15.5133f, 6.75f, 15.0f, 6.75f)
                horizontalLineTo(9.0f)
                close()
                moveTo(8.5f, 13.25f)
                curveTo(8.9142f, 13.25f, 9.25f, 13.5858f, 9.25f, 14.0f)
                verticalLineTo(14.75f)
                horizontalLineTo(10.0f)
                curveTo(10.4142f, 14.75f, 10.75f, 15.0858f, 10.75f, 15.5f)
                curveTo(10.75f, 15.9142f, 10.4142f, 16.25f, 10.0f, 16.25f)
                horizontalLineTo(9.25f)
                verticalLineTo(17.0f)
                curveTo(9.25f, 17.4142f, 8.9142f, 17.75f, 8.5f, 17.75f)
                curveTo(8.0858f, 17.75f, 7.75f, 17.4142f, 7.75f, 17.0f)
                verticalLineTo(16.25f)
                horizontalLineTo(7.0f)
                curveTo(6.5858f, 16.25f, 6.25f, 15.9142f, 6.25f, 15.5f)
                curveTo(6.25f, 15.0858f, 6.5858f, 14.75f, 7.0f, 14.75f)
                horizontalLineTo(7.75f)
                verticalLineTo(14.0f)
                curveTo(7.75f, 13.5858f, 8.0858f, 13.25f, 8.5f, 13.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.3333f, 13.8333f)
                curveTo(16.3333f, 14.2936f, 15.9602f, 14.6667f, 15.5f, 14.6667f)
                curveTo(15.0398f, 14.6667f, 14.6667f, 14.2936f, 14.6667f, 13.8333f)
                curveTo(14.6667f, 13.3731f, 15.0398f, 13.0f, 15.5f, 13.0f)
                curveTo(15.9602f, 13.0f, 16.3333f, 13.3731f, 16.3333f, 13.8333f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.3333f, 17.1667f)
                curveTo(16.3333f, 17.6269f, 15.9602f, 18.0f, 15.5f, 18.0f)
                curveTo(15.0398f, 18.0f, 14.6667f, 17.6269f, 14.6667f, 17.1667f)
                curveTo(14.6667f, 16.7064f, 15.0398f, 16.3333f, 15.5f, 16.3333f)
                curveTo(15.9602f, 16.3333f, 16.3333f, 16.7064f, 16.3333f, 17.1667f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.6667f, 15.5f)
                curveTo(14.6667f, 15.9602f, 14.2936f, 16.3333f, 13.8333f, 16.3333f)
                curveTo(13.3731f, 16.3333f, 13.0f, 15.9602f, 13.0f, 15.5f)
                curveTo(13.0f, 15.0398f, 13.3731f, 14.6667f, 13.8333f, 14.6667f)
                curveTo(14.2936f, 14.6667f, 14.6667f, 15.0398f, 14.6667f, 15.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.0f, 15.5f)
                curveTo(18.0f, 15.9602f, 17.6269f, 16.3333f, 17.1667f, 16.3333f)
                curveTo(16.7064f, 16.3333f, 16.3333f, 15.9602f, 16.3333f, 15.5f)
                curveTo(16.3333f, 15.0398f, 16.7064f, 14.6667f, 17.1667f, 14.6667f)
                curveTo(17.6269f, 14.6667f, 18.0f, 15.0398f, 18.0f, 15.5f)
                close()
            }
        }
            .build()
        return _gameboy!!
    }

private var _gameboy: ImageVector? = null
