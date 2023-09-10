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

val WeatherGroup.CloudWaterdrop: ImageVector
    get() {
        if (_cloudWaterdrop != null) {
            return _cloudWaterdrop!!
        }
        _cloudWaterdrop = Builder(
            name = "CloudWaterdrop", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.4762f, 3.75f)
                curveTo(9.7261f, 3.75f, 7.5119f, 5.9508f, 7.5119f, 8.6471f)
                curveTo(7.5119f, 9.1092f, 7.5766f, 9.5555f, 7.6973f, 9.9781f)
                curveTo(8.1945f, 10.1216f, 8.6599f, 10.3389f, 9.0805f, 10.6171f)
                curveTo(9.4259f, 10.8456f, 9.5207f, 11.3109f, 9.2922f, 11.6564f)
                curveTo(9.0637f, 12.0019f, 8.5983f, 12.0967f, 8.2529f, 11.8681f)
                curveTo(7.8721f, 11.6162f, 7.4392f, 11.4355f, 6.9733f, 11.3451f)
                curveTo(6.7515f, 11.3021f, 6.5216f, 11.2794f, 6.2857f, 11.2794f)
                curveTo(4.3246f, 11.2794f, 2.75f, 12.8482f, 2.75f, 14.7647f)
                curveTo(2.75f, 16.6812f, 4.3246f, 18.25f, 6.2857f, 18.25f)
                curveTo(6.6999f, 18.25f, 7.0357f, 18.5858f, 7.0357f, 19.0f)
                curveTo(7.0357f, 19.4142f, 6.6999f, 19.75f, 6.2857f, 19.75f)
                curveTo(3.513f, 19.75f, 1.25f, 17.5264f, 1.25f, 14.7647f)
                curveTo(1.25f, 12.0605f, 3.4199f, 9.8721f, 6.1135f, 9.7823f)
                curveTo(6.0467f, 9.4136f, 6.0119f, 9.0341f, 6.0119f, 8.6471f)
                curveTo(6.0119f, 5.1057f, 8.9145f, 2.25f, 12.4762f, 2.25f)
                curveTo(15.6343f, 2.25f, 18.2724f, 4.4937f, 18.8314f, 7.4713f)
                curveTo(21.1313f, 8.4475f, 22.75f, 10.7093f, 22.75f, 13.3529f)
                curveTo(22.75f, 16.4269f, 20.5623f, 18.9843f, 17.6568f, 19.6057f)
                curveTo(17.2518f, 19.6923f, 16.8532f, 19.4341f, 16.7666f, 19.0291f)
                curveTo(16.68f, 18.624f, 16.9381f, 18.2254f, 17.3432f, 18.1388f)
                curveTo(19.5829f, 17.6598f, 21.25f, 15.693f, 21.25f, 13.3529f)
                curveTo(21.25f, 11.2162f, 19.8607f, 9.3909f, 17.9124f, 8.7246f)
                curveTo(17.4038f, 8.5507f, 16.8568f, 8.4559f, 16.2857f, 8.4559f)
                curveTo(15.7031f, 8.4559f, 15.1455f, 8.5546f, 14.6283f, 8.7353f)
                curveTo(14.2372f, 8.8719f, 13.8095f, 8.6656f, 13.6729f, 8.2745f)
                curveTo(13.5363f, 7.8835f, 13.7426f, 7.4557f, 14.1336f, 7.3192f)
                curveTo(14.8079f, 7.0836f, 15.5326f, 6.9559f, 16.2857f, 6.9559f)
                curveTo(16.5812f, 6.9559f, 16.8723f, 6.9756f, 17.1577f, 7.0137f)
                curveTo(16.477f, 5.1163f, 14.6422f, 3.75f, 12.4762f, 3.75f)
                close()
                moveTo(12.6662f, 16.6465f)
                curveTo(12.2939f, 16.2631f, 11.7061f, 16.2631f, 11.3338f, 16.6465f)
                curveTo(10.9324f, 17.06f, 10.5184f, 17.5347f, 10.2096f, 17.9992f)
                curveTo(9.8841f, 18.4887f, 9.75f, 18.8578f, 9.75f, 19.0833f)
                curveTo(9.75f, 20.2602f, 10.7373f, 21.25f, 12.0f, 21.25f)
                curveTo(13.2627f, 21.25f, 14.25f, 20.2602f, 14.25f, 19.0833f)
                curveTo(14.25f, 18.8578f, 14.1158f, 18.4887f, 13.7904f, 17.9992f)
                curveTo(13.4816f, 17.5347f, 13.0676f, 17.06f, 12.6662f, 16.6465f)
                close()
                moveTo(10.2577f, 15.6016f)
                curveTo(11.2191f, 14.6114f, 12.7809f, 14.6114f, 13.7423f, 15.6016f)
                curveTo(14.1752f, 16.0474f, 14.6591f, 16.5965f, 15.0396f, 17.1688f)
                curveTo(15.4034f, 17.7161f, 15.75f, 18.397f, 15.75f, 19.0833f)
                curveTo(15.75f, 21.1282f, 14.051f, 22.75f, 12.0f, 22.75f)
                curveTo(9.949f, 22.75f, 8.25f, 21.1282f, 8.25f, 19.0833f)
                curveTo(8.25f, 18.397f, 8.5966f, 17.7161f, 8.9604f, 17.1688f)
                curveTo(9.3409f, 16.5965f, 9.8248f, 16.0474f, 10.2577f, 15.6016f)
                close()
            }
        }
            .build()
        return _cloudWaterdrop!!
    }

private var _cloudWaterdrop: ImageVector? = null
