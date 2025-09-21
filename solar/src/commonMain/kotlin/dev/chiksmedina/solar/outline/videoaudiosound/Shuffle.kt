package dev.chiksmedina.solar.outline.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.VideoAudioSoundGroup

val VideoAudioSoundGroup.Shuffle: ImageVector
    get() {
        if (_shuffle != null) {
            return _shuffle!!
        }
        _shuffle = Builder(
            name = "Shuffle", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(19.4697f, 4.4697f)
                curveTo(19.7626f, 4.1768f, 20.2374f, 4.1768f, 20.5303f, 4.4697f)
                lineTo(22.5303f, 6.4697f)
                curveTo(22.8232f, 6.7626f, 22.8232f, 7.2374f, 22.5303f, 7.5303f)
                lineTo(20.5303f, 9.5303f)
                curveTo(20.2374f, 9.8232f, 19.7626f, 9.8232f, 19.4697f, 9.5303f)
                curveTo(19.1768f, 9.2374f, 19.1768f, 8.7626f, 19.4697f, 8.4697f)
                lineTo(20.1893f, 7.75f)
                horizontalLineTo(18.3971f)
                curveTo(17.5531f, 7.75f, 16.9733f, 7.7508f, 16.517f, 7.7952f)
                curveTo(16.077f, 7.8379f, 15.8108f, 7.917f, 15.59f, 8.0421f)
                curveTo(15.3692f, 8.1671f, 15.1644f, 8.3546f, 14.9013f, 8.71f)
                curveTo(14.6286f, 9.0783f, 14.3295f, 9.5752f, 13.8953f, 10.2989f)
                lineTo(11.3722f, 14.5041f)
                curveTo(10.9613f, 15.189f, 10.6254f, 15.7488f, 10.3042f, 16.1826f)
                curveTo(9.9685f, 16.636f, 9.616f, 16.9989f, 9.149f, 17.2632f)
                curveTo(8.6821f, 17.5276f, 8.1896f, 17.6432f, 7.6281f, 17.6978f)
                curveTo(7.0909f, 17.75f, 6.438f, 17.75f, 5.6394f, 17.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 17.75f, 1.25f, 17.4142f, 1.25f, 17.0f)
                curveTo(1.25f, 16.5858f, 1.5858f, 16.25f, 2.0f, 16.25f)
                horizontalLineTo(5.6029f)
                curveTo(6.4468f, 16.25f, 7.0268f, 16.2492f, 7.483f, 16.2048f)
                curveTo(7.923f, 16.1621f, 8.1892f, 16.083f, 8.41f, 15.9579f)
                curveTo(8.6308f, 15.8329f, 8.8356f, 15.6454f, 9.0987f, 15.29f)
                curveTo(9.3714f, 14.9217f, 9.6705f, 14.4248f, 10.1047f, 13.7011f)
                lineTo(12.6278f, 9.4959f)
                curveTo(13.0387f, 8.811f, 13.3746f, 8.2512f, 13.6958f, 7.8174f)
                curveTo(14.0315f, 7.364f, 14.384f, 7.0011f, 14.851f, 6.7368f)
                curveTo(15.3179f, 6.4724f, 15.8104f, 6.3568f, 16.3719f, 6.3022f)
                curveTo(16.9091f, 6.25f, 17.562f, 6.25f, 18.3606f, 6.25f)
                lineTo(20.1893f, 6.25f)
                lineTo(19.4697f, 5.5303f)
                curveTo(19.1768f, 5.2374f, 19.1768f, 4.7626f, 19.4697f, 4.4697f)
                close()
                moveTo(7.7313f, 7.7915f)
                curveTo(7.5352f, 7.7533f, 7.3133f, 7.75f, 6.6676f, 7.75f)
                horizontalLineTo(2.0f)
                curveTo(1.5858f, 7.75f, 1.25f, 7.4142f, 1.25f, 7.0f)
                curveTo(1.25f, 6.5858f, 1.5858f, 6.25f, 2.0f, 6.25f)
                horizontalLineTo(6.6676f)
                curveTo(6.6922f, 6.25f, 6.7165f, 6.25f, 6.7404f, 6.25f)
                curveTo(7.2857f, 6.2499f, 7.6618f, 6.2498f, 8.0179f, 6.3191f)
                curveTo(8.8174f, 6.4747f, 9.5444f, 6.8864f, 10.0892f, 7.4918f)
                curveTo(10.3318f, 7.7615f, 10.5252f, 8.084f, 10.8057f, 8.5517f)
                curveTo(10.818f, 8.5722f, 10.8305f, 8.593f, 10.8431f, 8.6141f)
                curveTo(11.0562f, 8.9693f, 10.9411f, 9.43f, 10.5859f, 9.6431f)
                curveTo(10.2307f, 9.8562f, 9.77f, 9.7411f, 9.5569f, 9.3859f)
                curveTo(9.2247f, 8.8322f, 9.1077f, 8.6436f, 8.9741f, 8.4951f)
                curveTo(8.6472f, 8.1318f, 8.211f, 7.8848f, 7.7313f, 7.7915f)
                close()
                moveTo(13.4141f, 14.3569f)
                curveTo(13.7693f, 14.1438f, 14.23f, 14.2589f, 14.4431f, 14.6141f)
                curveTo(14.7753f, 15.1678f, 14.8923f, 15.3564f, 15.0259f, 15.5049f)
                curveTo(15.3528f, 15.8682f, 15.789f, 16.1152f, 16.2687f, 16.2086f)
                curveTo(16.4648f, 16.2467f, 16.6867f, 16.25f, 17.3324f, 16.25f)
                horizontalLineTo(20.1893f)
                lineTo(19.4697f, 15.5303f)
                curveTo(19.1768f, 15.2374f, 19.1768f, 14.7626f, 19.4697f, 14.4697f)
                curveTo(19.7626f, 14.1768f, 20.2374f, 14.1768f, 20.5303f, 14.4697f)
                lineTo(22.5303f, 16.4697f)
                curveTo(22.8232f, 16.7626f, 22.8232f, 17.2374f, 22.5303f, 17.5303f)
                lineTo(20.5303f, 19.5303f)
                curveTo(20.2374f, 19.8232f, 19.7626f, 19.8232f, 19.4697f, 19.5303f)
                curveTo(19.1768f, 19.2374f, 19.1768f, 18.7626f, 19.4697f, 18.4697f)
                lineTo(20.1893f, 17.75f)
                horizontalLineTo(17.3324f)
                curveTo(17.3078f, 17.75f, 17.2835f, 17.75f, 17.2595f, 17.75f)
                curveTo(16.7143f, 17.7501f, 16.3382f, 17.7502f, 15.9821f, 17.6809f)
                curveTo(15.1826f, 17.5253f, 14.4556f, 17.1137f, 13.9108f, 16.5082f)
                curveTo(13.6682f, 16.2385f, 13.4748f, 15.916f, 13.1943f, 15.4483f)
                curveTo(13.182f, 15.4278f, 13.1695f, 15.407f, 13.1569f, 15.3859f)
                curveTo(12.9438f, 15.0307f, 13.0589f, 14.57f, 13.4141f, 14.3569f)
                close()
            }
        }
            .build()
        return _shuffle!!
    }

private var _shuffle: ImageVector? = null
