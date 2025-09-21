package dev.chiksmedina.solar.outline.weather

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.WeatherGroup

val WeatherGroup.CloudWaterdrops: ImageVector
    get() {
        if (_cloudWaterdrops != null) {
            return _cloudWaterdrops!!
        }
        _cloudWaterdrops = Builder(
            name = "CloudWaterdrops", defaultWidth = 24.0.dp, defaultHeight =
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
                curveTo(2.75f, 16.3183f, 3.7836f, 17.6432f, 5.2223f, 18.0898f)
                curveTo(5.6179f, 18.2126f, 5.8391f, 18.6328f, 5.7163f, 19.0284f)
                curveTo(5.5935f, 19.424f, 5.1733f, 19.6452f, 4.7777f, 19.5224f)
                curveTo(2.7389f, 18.8896f, 1.25f, 17.0039f, 1.25f, 14.7647f)
                curveTo(1.25f, 12.0605f, 3.4199f, 9.8721f, 6.1135f, 9.7823f)
                curveTo(6.0467f, 9.4136f, 6.0119f, 9.0341f, 6.0119f, 8.6471f)
                curveTo(6.0119f, 5.1057f, 8.9145f, 2.25f, 12.4762f, 2.25f)
                curveTo(15.6343f, 2.25f, 18.2724f, 4.4937f, 18.8314f, 7.4713f)
                curveTo(21.1313f, 8.4475f, 22.75f, 10.7093f, 22.75f, 13.3529f)
                curveTo(22.75f, 16.0133f, 21.1103f, 18.2874f, 18.7879f, 19.2529f)
                curveTo(18.4055f, 19.4119f, 17.9665f, 19.2308f, 17.8075f, 18.8483f)
                curveTo(17.6485f, 18.4658f, 17.8296f, 18.0269f, 18.2121f, 17.8679f)
                curveTo(20.0022f, 17.1236f, 21.25f, 15.3783f, 21.25f, 13.3529f)
                curveTo(21.25f, 11.2162f, 19.8607f, 9.3909f, 17.9124f, 8.7246f)
                curveTo(17.4038f, 8.5507f, 16.8568f, 8.4559f, 16.2857f, 8.4559f)
                curveTo(15.7031f, 8.4559f, 15.1455f, 8.5546f, 14.6283f, 8.7353f)
                curveTo(14.2372f, 8.8719f, 13.8095f, 8.6656f, 13.6729f, 8.2745f)
                curveTo(13.5363f, 7.8835f, 13.7426f, 7.4557f, 14.1336f, 7.3192f)
                curveTo(14.8079f, 7.0836f, 15.5326f, 6.9559f, 16.2857f, 6.9559f)
                curveTo(16.5812f, 6.9559f, 16.8723f, 6.9756f, 17.1577f, 7.0137f)
                curveTo(16.477f, 5.1163f, 14.6422f, 3.75f, 12.4762f, 3.75f)
                close()
                moveTo(12.0f, 14.1345f)
                curveTo(11.9822f, 14.1345f, 11.9585f, 14.1407f, 11.9338f, 14.1702f)
                curveTo(11.7451f, 14.3956f, 11.5612f, 14.6423f, 11.4281f, 14.8757f)
                curveTo(11.2845f, 15.1277f, 11.25f, 15.2784f, 11.25f, 15.3333f)
                curveTo(11.25f, 15.9159f, 11.6582f, 16.25f, 12.0f, 16.25f)
                curveTo(12.3418f, 16.25f, 12.75f, 15.9159f, 12.75f, 15.3333f)
                curveTo(12.75f, 15.2784f, 12.7155f, 15.1277f, 12.5719f, 14.8757f)
                curveTo(12.4388f, 14.6423f, 12.2549f, 14.3956f, 12.0662f, 14.1702f)
                curveTo(12.0415f, 14.1407f, 12.0178f, 14.1345f, 12.0f, 14.1345f)
                close()
                moveTo(10.7836f, 13.2073f)
                curveTo(11.423f, 12.4436f, 12.577f, 12.4436f, 13.2164f, 13.2073f)
                curveTo(13.4352f, 13.4687f, 13.6806f, 13.7918f, 13.875f, 14.1328f)
                curveTo(14.0589f, 14.4553f, 14.25f, 14.8834f, 14.25f, 15.3333f)
                curveTo(14.25f, 16.5917f, 13.315f, 17.75f, 12.0f, 17.75f)
                curveTo(10.685f, 17.75f, 9.75f, 16.5917f, 9.75f, 15.3333f)
                curveTo(9.75f, 14.8834f, 9.9411f, 14.4553f, 10.125f, 14.1328f)
                curveTo(10.3194f, 13.7918f, 10.5648f, 13.4687f, 10.7836f, 13.2073f)
                close()
                moveTo(9.5f, 19.1345f)
                curveTo(9.4822f, 19.1345f, 9.4585f, 19.1407f, 9.4338f, 19.1702f)
                curveTo(9.2451f, 19.3956f, 9.0612f, 19.6423f, 8.9281f, 19.8757f)
                curveTo(8.7845f, 20.1277f, 8.75f, 20.2784f, 8.75f, 20.3333f)
                curveTo(8.75f, 20.9159f, 9.1582f, 21.25f, 9.5f, 21.25f)
                curveTo(9.8418f, 21.25f, 10.25f, 20.9159f, 10.25f, 20.3333f)
                curveTo(10.25f, 20.2784f, 10.2155f, 20.1277f, 10.0719f, 19.8757f)
                curveTo(9.9388f, 19.6423f, 9.7549f, 19.3956f, 9.5662f, 19.1702f)
                curveTo(9.5415f, 19.1407f, 9.5178f, 19.1345f, 9.5f, 19.1345f)
                close()
                moveTo(8.2836f, 18.2073f)
                curveTo(8.923f, 17.4436f, 10.077f, 17.4436f, 10.7164f, 18.2073f)
                curveTo(10.9352f, 18.4687f, 11.1806f, 18.7918f, 11.375f, 19.1328f)
                curveTo(11.5589f, 19.4553f, 11.75f, 19.8834f, 11.75f, 20.3333f)
                curveTo(11.75f, 21.5917f, 10.815f, 22.75f, 9.5f, 22.75f)
                curveTo(8.185f, 22.75f, 7.25f, 21.5917f, 7.25f, 20.3333f)
                curveTo(7.25f, 19.8834f, 7.4412f, 19.4553f, 7.625f, 19.1328f)
                curveTo(7.8194f, 18.7918f, 8.0648f, 18.4687f, 8.2836f, 18.2073f)
                close()
                moveTo(14.5f, 19.1345f)
                curveTo(14.4822f, 19.1345f, 14.4585f, 19.1407f, 14.4338f, 19.1702f)
                curveTo(14.2451f, 19.3956f, 14.0612f, 19.6423f, 13.9281f, 19.8757f)
                curveTo(13.7845f, 20.1277f, 13.75f, 20.2784f, 13.75f, 20.3333f)
                curveTo(13.75f, 20.9159f, 14.1582f, 21.25f, 14.5f, 21.25f)
                curveTo(14.8418f, 21.25f, 15.25f, 20.9159f, 15.25f, 20.3333f)
                curveTo(15.25f, 20.2784f, 15.2155f, 20.1277f, 15.0719f, 19.8757f)
                curveTo(14.9388f, 19.6423f, 14.7549f, 19.3956f, 14.5662f, 19.1702f)
                curveTo(14.5415f, 19.1407f, 14.5178f, 19.1345f, 14.5f, 19.1345f)
                close()
                moveTo(13.2836f, 18.2073f)
                curveTo(13.923f, 17.4436f, 15.077f, 17.4436f, 15.7164f, 18.2073f)
                curveTo(15.9352f, 18.4687f, 16.1806f, 18.7918f, 16.375f, 19.1328f)
                curveTo(16.5589f, 19.4553f, 16.75f, 19.8834f, 16.75f, 20.3333f)
                curveTo(16.75f, 21.5917f, 15.815f, 22.75f, 14.5f, 22.75f)
                curveTo(13.185f, 22.75f, 12.25f, 21.5917f, 12.25f, 20.3333f)
                curveTo(12.25f, 19.8834f, 12.4411f, 19.4553f, 12.625f, 19.1328f)
                curveTo(12.8194f, 18.7918f, 13.0648f, 18.4687f, 13.2836f, 18.2073f)
                close()
            }
        }
            .build()
        return _cloudWaterdrops!!
    }

private var _cloudWaterdrops: ImageVector? = null
