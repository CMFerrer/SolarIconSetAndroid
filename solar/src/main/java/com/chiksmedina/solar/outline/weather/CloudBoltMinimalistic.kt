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

val WeatherGroup.CloudBoltMinimalistic: ImageVector
    get() {
        if (_cloudBoltMinimalistic != null) {
            return _cloudBoltMinimalistic!!
        }
        _cloudBoltMinimalistic = Builder(
            name = "CloudBoltMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.4762f, 2.75f)
                curveTo(9.7261f, 2.75f, 7.5119f, 4.9508f, 7.5119f, 7.6471f)
                curveTo(7.5119f, 8.1092f, 7.5766f, 8.5555f, 7.6973f, 8.9781f)
                curveTo(8.1945f, 9.1216f, 8.6599f, 9.3389f, 9.0805f, 9.6171f)
                curveTo(9.4259f, 9.8456f, 9.5207f, 10.3109f, 9.2922f, 10.6564f)
                curveTo(9.0637f, 11.0019f, 8.5983f, 11.0967f, 8.2529f, 10.8681f)
                curveTo(7.8721f, 10.6162f, 7.4392f, 10.4355f, 6.9733f, 10.3451f)
                curveTo(6.7515f, 10.3021f, 6.5216f, 10.2794f, 6.2857f, 10.2794f)
                curveTo(4.3246f, 10.2794f, 2.75f, 11.8482f, 2.75f, 13.7647f)
                curveTo(2.75f, 15.6812f, 4.3246f, 17.25f, 6.2857f, 17.25f)
                curveTo(6.6999f, 17.25f, 7.0357f, 17.5858f, 7.0357f, 18.0f)
                curveTo(7.0357f, 18.4142f, 6.6999f, 18.75f, 6.2857f, 18.75f)
                curveTo(3.513f, 18.75f, 1.25f, 16.5264f, 1.25f, 13.7647f)
                curveTo(1.25f, 11.0605f, 3.4199f, 8.8721f, 6.1135f, 8.7823f)
                curveTo(6.0467f, 8.4136f, 6.0119f, 8.0341f, 6.0119f, 7.6471f)
                curveTo(6.0119f, 4.1057f, 8.9145f, 1.25f, 12.4762f, 1.25f)
                curveTo(15.6343f, 1.25f, 18.2724f, 3.4937f, 18.8314f, 6.4713f)
                curveTo(21.1313f, 7.4475f, 22.75f, 9.7093f, 22.75f, 12.3529f)
                curveTo(22.75f, 15.4269f, 20.5623f, 17.9843f, 17.6568f, 18.6057f)
                curveTo(17.2518f, 18.6923f, 16.8532f, 18.4341f, 16.7666f, 18.0291f)
                curveTo(16.68f, 17.624f, 16.9381f, 17.2254f, 17.3432f, 17.1388f)
                curveTo(19.5829f, 16.6598f, 21.25f, 14.693f, 21.25f, 12.3529f)
                curveTo(21.25f, 10.2162f, 19.8607f, 8.3909f, 17.9124f, 7.7246f)
                curveTo(17.4038f, 7.5507f, 16.8568f, 7.4559f, 16.2857f, 7.4559f)
                curveTo(15.7031f, 7.4559f, 15.1455f, 7.5546f, 14.6283f, 7.7353f)
                curveTo(14.2372f, 7.8719f, 13.8095f, 7.6656f, 13.6729f, 7.2745f)
                curveTo(13.5363f, 6.8835f, 13.7426f, 6.4557f, 14.1336f, 6.3192f)
                curveTo(14.8079f, 6.0836f, 15.5326f, 5.9559f, 16.2857f, 5.9559f)
                curveTo(16.5812f, 5.9559f, 16.8723f, 5.9756f, 17.1577f, 6.0137f)
                curveTo(16.477f, 4.1163f, 14.6422f, 2.75f, 12.4762f, 2.75f)
                close()
                moveTo(14.8539f, 14.1257f)
                curveTo(15.1243f, 14.4395f, 15.0891f, 14.913f, 14.7753f, 15.1834f)
                lineTo(12.0195f, 17.5578f)
                horizontalLineTo(14.2857f)
                curveTo(14.5992f, 17.5578f, 14.8797f, 17.7529f, 14.9888f, 18.0467f)
                curveTo(15.0979f, 18.3406f, 15.0128f, 18.6714f, 14.7752f, 18.8761f)
                lineTo(10.4895f, 22.5684f)
                curveTo(10.1757f, 22.8387f, 9.7022f, 22.8035f, 9.4318f, 22.4897f)
                curveTo(9.1614f, 22.1759f, 9.1967f, 21.7023f, 9.5105f, 21.4319f)
                lineTo(12.2661f, 19.0578f)
                horizontalLineTo(10.0f)
                curveTo(9.6865f, 19.0578f, 9.4061f, 18.8629f, 9.2969f, 18.569f)
                curveTo(9.1878f, 18.2751f, 9.2729f, 17.9443f, 9.5104f, 17.7397f)
                lineTo(13.7962f, 14.047f)
                curveTo(14.11f, 13.7767f, 14.5835f, 13.8119f, 14.8539f, 14.1257f)
                close()
            }
        }
            .build()
        return _cloudBoltMinimalistic!!
    }

private var _cloudBoltMinimalistic: ImageVector? = null
