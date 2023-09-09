package com.chiksmedina.solar.boldduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.VideoAudioSoundGroup

public val VideoAudioSoundGroup.VolumeCross: ImageVector
    get() {
        if (_volumeCross != null) {
            return _volumeCross!!
        }
        _volumeCross = Builder(name = "VolumeCross", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(21.7803f, 3.5303f)
                curveTo(22.0732f, 3.2374f, 22.0732f, 2.7626f, 21.7803f, 2.4697f)
                curveTo(21.4874f, 2.1768f, 21.0126f, 2.1768f, 20.7197f, 2.4697f)
                lineTo(16.2705f, 6.9189f)
                curveTo(16.2246f, 6.3953f, 16.1646f, 5.932f, 16.077f, 5.5298f)
                curveTo(15.9052f, 4.7414f, 15.6003f, 4.0558f, 14.9609f, 3.6065f)
                curveTo(14.7259f, 3.4413f, 14.4642f, 3.3081f, 14.1923f, 3.2153f)
                curveTo(13.3741f, 2.9361f, 12.5608f, 3.1593f, 11.7348f, 3.5605f)
                curveTo(10.9212f, 3.9558f, 9.9341f, 4.6066f, 8.7032f, 5.4182f)
                lineTo(8.4365f, 5.5941f)
                curveTo(7.9886f, 5.8894f, 7.8345f, 5.9882f, 7.6751f, 6.0585f)
                curveTo(7.5045f, 6.1338f, 7.3252f, 6.1876f, 7.1413f, 6.2186f)
                curveTo(6.9696f, 6.2476f, 6.7866f, 6.25f, 6.2501f, 6.25f)
                lineTo(6.0891f, 6.25f)
                curveTo(4.8721f, 6.2493f, 4.0266f, 6.2489f, 3.275f, 6.5966f)
                curveTo(2.5802f, 6.9181f, 1.9114f, 7.5473f, 1.5483f, 8.2213f)
                curveTo(1.1557f, 8.95f, 1.1096f, 9.712f, 1.0441f, 10.7955f)
                lineTo(1.0362f, 10.926f)
                curveTo(1.0137f, 11.2943f, 1.0f, 11.6585f, 1.0f, 12.0f)
                curveTo(1.0f, 12.3416f, 1.0137f, 12.7058f, 1.0362f, 13.0741f)
                lineTo(1.0441f, 13.2045f)
                curveTo(1.1096f, 14.2881f, 1.1557f, 15.0501f, 1.5483f, 15.7788f)
                curveTo(1.9114f, 16.4527f, 2.5802f, 17.082f, 3.275f, 17.4034f)
                curveTo(3.8855f, 17.6859f, 4.558f, 17.7386f, 5.4412f, 17.7481f)
                lineTo(2.7197f, 20.4697f)
                curveTo(2.4268f, 20.7626f, 2.4268f, 21.2374f, 2.7197f, 21.5303f)
                curveTo(3.0126f, 21.8232f, 3.4874f, 21.8232f, 3.7803f, 21.5303f)
                lineTo(21.7803f, 3.5303f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(16.2385f, 9.0723f)
                lineTo(7.6145f, 17.6963f)
                curveTo(8.0098f, 18.1712f, 9.0262f, 18.8138f, 9.339f, 19.0002f)
                curveTo(10.3778f, 19.6809f, 11.2375f, 20.2249f, 11.9705f, 20.5491f)
                curveTo(12.7128f, 20.8775f, 13.4503f, 21.0381f, 14.1923f, 20.7849f)
                curveTo(14.4642f, 20.6921f, 14.7259f, 20.5589f, 14.961f, 20.3937f)
                curveTo(15.667f, 19.8975f, 15.9659f, 19.1135f, 16.1278f, 18.2141f)
                curveTo(16.287f, 17.3297f, 16.3415f, 16.1578f, 16.4093f, 14.6979f)
                lineTo(16.412f, 14.6404f)
                curveTo(16.4638f, 13.5254f, 16.5f, 12.5522f, 16.5f, 12.0002f)
                curveTo(16.5f, 11.9729f, 16.5002f, 11.9363f, 16.5004f, 11.8916f)
                curveTo(16.5033f, 11.3245f, 16.5125f, 9.4627f, 16.2385f, 9.0723f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.5145f, 6.3166f)
                curveTo(20.8921f, 6.1462f, 21.3362f, 6.3142f, 21.5066f, 6.6918f)
                curveTo(21.9736f, 7.7269f, 22.5f, 9.4597f, 22.5f, 12.0002f)
                curveTo(22.5f, 14.1917f, 22.1083f, 15.783f, 21.7001f, 16.8444f)
                curveTo(21.4963f, 17.3742f, 21.2894f, 17.7693f, 21.1275f, 18.0392f)
                curveTo(21.0466f, 18.174f, 20.977f, 18.2774f, 20.9248f, 18.3505f)
                curveTo(20.8987f, 18.3871f, 20.8769f, 18.4161f, 20.8602f, 18.4377f)
                curveTo(20.8519f, 18.4485f, 20.8448f, 18.4574f, 20.8391f, 18.4645f)
                lineTo(20.8316f, 18.4738f)
                lineTo(20.8286f, 18.4774f)
                lineTo(20.8274f, 18.4789f)
                curveTo(20.8274f, 18.4789f, 20.8262f, 18.4803f, 20.2515f, 18.0013f)
                lineTo(20.8262f, 18.4803f)
                curveTo(20.561f, 18.7985f, 20.0881f, 18.8415f, 19.7699f, 18.5763f)
                curveTo(19.4532f, 18.3124f, 19.4091f, 17.8428f, 19.6701f, 17.5246f)
                lineTo(19.6736f, 17.5202f)
                lineTo(19.6837f, 17.5068f)
                curveTo(19.6891f, 17.4996f, 19.696f, 17.4902f, 19.7042f, 17.4787f)
                curveTo(19.734f, 17.437f, 19.7816f, 17.3669f, 19.8413f, 17.2674f)
                curveTo(19.9607f, 17.0685f, 20.1288f, 16.7512f, 20.3f, 16.3059f)
                curveTo(20.6418f, 15.4173f, 21.0f, 14.0086f, 21.0f, 12.0002f)
                curveTo(21.0f, 9.6738f, 20.5194f, 8.1512f, 20.1393f, 7.3087f)
                curveTo(19.969f, 6.9311f, 20.1369f, 6.4869f, 20.5145f, 6.3166f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.4f, strokeAlpha
                    = 0.4f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.3008f, 9.8477f)
                curveTo(19.2166f, 9.4421f, 18.8196f, 9.1816f, 18.414f, 9.2658f)
                curveTo(18.0085f, 9.35f, 17.748f, 9.7471f, 17.8322f, 10.1526f)
                curveTo(17.9207f, 10.5789f, 18.0f, 11.1874f, 18.0f, 12.0002f)
                curveTo(18.0f, 12.99f, 17.8823f, 13.6773f, 17.7735f, 14.1014f)
                curveTo(17.7191f, 14.3137f, 17.6667f, 14.461f, 17.6318f, 14.5482f)
                curveTo(17.6144f, 14.5918f, 17.6012f, 14.6205f, 17.5944f, 14.6349f)
                lineTo(17.5894f, 14.6452f)
                curveTo(17.3955f, 15.0058f, 17.5268f, 15.4563f, 17.8858f, 15.6558f)
                curveTo(18.2479f, 15.8569f, 18.7045f, 15.7265f, 18.9057f, 15.3644f)
                lineTo(18.2511f, 15.0008f)
                curveTo(18.9057f, 15.3644f, 18.9064f, 15.3631f, 18.9064f, 15.3631f)
                lineTo(18.9072f, 15.3617f)
                lineTo(18.9088f, 15.3586f)
                lineTo(18.9127f, 15.3515f)
                lineTo(18.9223f, 15.3332f)
                curveTo(18.9296f, 15.3191f, 18.9384f, 15.3014f, 18.9487f, 15.2798f)
                curveTo(18.9692f, 15.2368f, 18.9951f, 15.1788f, 19.0245f, 15.1053f)
                curveTo(19.0834f, 14.9581f, 19.156f, 14.7492f, 19.2265f, 14.4739f)
                curveTo(19.3678f, 13.923f, 19.5f, 13.1103f, 19.5f, 12.0002f)
                curveTo(19.5f, 11.0891f, 19.411f, 10.3782f, 19.3008f, 9.8477f)
                close()
            }
        }
        .build()
        return _volumeCross!!
    }

private var _volumeCross: ImageVector? = null
