package com.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.WeatherGroup

public val WeatherGroup.Fog: ImageVector
    get() {
        if (_fog != null) {
            return _fog!!
        }
        _fog = Builder(name = "Fog", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
                = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.4762f, 2.75f)
                curveTo(9.7261f, 2.75f, 7.5119f, 4.9508f, 7.5119f, 7.6471f)
                curveTo(7.5119f, 8.1092f, 7.5766f, 8.5555f, 7.6973f, 8.9781f)
                curveTo(8.1945f, 9.1216f, 8.6599f, 9.3389f, 9.0805f, 9.6171f)
                curveTo(9.4259f, 9.8456f, 9.5207f, 10.3109f, 9.2922f, 10.6564f)
                curveTo(9.0637f, 11.0019f, 8.5983f, 11.0967f, 8.2529f, 10.8681f)
                curveTo(7.8721f, 10.6162f, 7.4392f, 10.4355f, 6.9733f, 10.3451f)
                curveTo(6.7515f, 10.3021f, 6.5216f, 10.2794f, 6.2857f, 10.2794f)
                curveTo(4.3246f, 10.2794f, 2.75f, 11.8482f, 2.75f, 13.7647f)
                curveTo(2.75f, 14.2966f, 2.8704f, 14.7997f, 3.086f, 15.25f)
                horizontalLineTo(20.2886f)
                curveTo(20.8937f, 14.438f, 21.25f, 13.4369f, 21.25f, 12.3529f)
                curveTo(21.25f, 10.2162f, 19.8607f, 8.3909f, 17.9124f, 7.7246f)
                curveTo(17.4038f, 7.5507f, 16.8568f, 7.4559f, 16.2857f, 7.4559f)
                curveTo(15.7031f, 7.4559f, 15.1455f, 7.5546f, 14.6283f, 7.7353f)
                curveTo(14.2372f, 7.8719f, 13.8095f, 7.6656f, 13.6729f, 7.2745f)
                curveTo(13.5363f, 6.8835f, 13.7426f, 6.4557f, 14.1336f, 6.3192f)
                curveTo(14.8079f, 6.0836f, 15.5326f, 5.9559f, 16.2857f, 5.9559f)
                curveTo(16.5812f, 5.9559f, 16.8723f, 5.9756f, 17.1577f, 6.0137f)
                curveTo(16.477f, 4.1163f, 14.6422f, 2.75f, 12.4762f, 2.75f)
                close()
                moveTo(18.8314f, 6.4713f)
                curveTo(18.2724f, 3.4937f, 15.6343f, 1.25f, 12.4762f, 1.25f)
                curveTo(8.9145f, 1.25f, 6.0119f, 4.1057f, 6.0119f, 7.6471f)
                curveTo(6.0119f, 8.0341f, 6.0467f, 8.4136f, 6.1135f, 8.7823f)
                curveTo(3.4199f, 8.8721f, 1.25f, 11.0605f, 1.25f, 13.7647f)
                curveTo(1.25f, 14.3422f, 1.3494f, 14.8973f, 1.5322f, 15.4137f)
                curveTo(1.3602f, 15.5511f, 1.25f, 15.7627f, 1.25f, 16.0f)
                curveTo(1.25f, 16.4142f, 1.5858f, 16.75f, 2.0f, 16.75f)
                horizontalLineTo(2.6334f)
                curveTo(2.6415f, 16.7501f, 2.6496f, 16.7501f, 2.6576f, 16.75f)
                horizontalLineTo(20.6437f)
                curveTo(20.6467f, 16.75f, 20.6498f, 16.75f, 20.6528f, 16.75f)
                horizontalLineTo(22.0f)
                curveTo(22.4142f, 16.75f, 22.75f, 16.4142f, 22.75f, 16.0f)
                curveTo(22.75f, 15.6025f, 22.4407f, 15.2772f, 22.0496f, 15.2516f)
                curveTo(22.4972f, 14.3816f, 22.75f, 13.3963f, 22.75f, 12.3529f)
                curveTo(22.75f, 9.7093f, 21.1313f, 7.4475f, 18.8314f, 6.4713f)
                close()
                moveTo(4.25f, 19.0f)
                curveTo(4.25f, 18.5858f, 4.5858f, 18.25f, 5.0f, 18.25f)
                horizontalLineTo(19.0f)
                curveTo(19.4142f, 18.25f, 19.75f, 18.5858f, 19.75f, 19.0f)
                curveTo(19.75f, 19.4142f, 19.4142f, 19.75f, 19.0f, 19.75f)
                horizontalLineTo(5.0f)
                curveTo(4.5858f, 19.75f, 4.25f, 19.4142f, 4.25f, 19.0f)
                close()
                moveTo(7.25f, 22.0f)
                curveTo(7.25f, 21.5858f, 7.5858f, 21.25f, 8.0f, 21.25f)
                horizontalLineTo(16.0f)
                curveTo(16.4142f, 21.25f, 16.75f, 21.5858f, 16.75f, 22.0f)
                curveTo(16.75f, 22.4142f, 16.4142f, 22.75f, 16.0f, 22.75f)
                horizontalLineTo(8.0f)
                curveTo(7.5858f, 22.75f, 7.25f, 22.4142f, 7.25f, 22.0f)
                close()
            }
        }
        .build()
        return _fog!!
    }

private var _fog: ImageVector? = null
