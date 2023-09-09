package com.chiksmedina.solar.boldduotone.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.boldduotone.SportsGroup

public val SportsGroup.MeditationRound: ImageVector
    get() {
        if (_meditationRound != null) {
            return _meditationRound!!
        }
        _meditationRound = Builder(name = "MeditationRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(14.5f, 4.5f)
                curveTo(14.5f, 5.8807f, 13.3807f, 7.0f, 12.0f, 7.0f)
                curveTo(10.6193f, 7.0f, 9.5f, 5.8807f, 9.5f, 4.5f)
                curveTo(9.5f, 3.1193f, 10.6193f, 2.0f, 12.0f, 2.0f)
                curveTo(13.3807f, 2.0f, 14.5f, 3.1193f, 14.5f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(8.9f, 15.55f)
                curveTo(9.1485f, 15.2186f, 9.6186f, 15.1515f, 9.95f, 15.4f)
                curveTo(10.2814f, 15.6485f, 10.3485f, 16.1186f, 10.1f, 16.45f)
                lineTo(9.1755f, 17.6827f)
                curveTo(9.1681f, 17.6925f, 9.1609f, 17.7021f, 9.1537f, 17.7117f)
                curveTo(9.0273f, 17.8804f, 8.9279f, 18.013f, 8.8133f, 18.1328f)
                curveTo(8.5315f, 18.4274f, 8.1877f, 18.6557f, 7.8067f, 18.8011f)
                curveTo(7.6519f, 18.8602f, 7.4911f, 18.9004f, 7.2866f, 18.9514f)
                curveTo(7.275f, 18.9543f, 7.2633f, 18.9573f, 7.2514f, 18.9602f)
                lineTo(5.458f, 19.4086f)
                curveTo(5.0419f, 19.5126f, 4.75f, 19.8865f, 4.75f, 20.3153f)
                curveTo(4.75f, 20.8315f, 5.1685f, 21.25f, 5.6847f, 21.25f)
                horizontalLineTo(6.3684f)
                curveTo(7.9143f, 21.25f, 9.4185f, 20.7486f, 10.6553f, 19.8211f)
                lineTo(12.55f, 18.4f)
                curveTo(12.8814f, 18.1515f, 13.3515f, 18.2186f, 13.6f, 18.55f)
                curveTo(13.8485f, 18.8814f, 13.7814f, 19.3515f, 13.45f, 19.6f)
                lineTo(12.5453f, 20.2785f)
                lineTo(13.0371f, 20.4629f)
                curveTo(13.571f, 20.6631f, 13.8118f, 20.7531f, 14.0537f, 20.8288f)
                curveTo(14.7819f, 21.0564f, 15.5355f, 21.193f, 16.2973f, 21.2356f)
                curveTo(16.5503f, 21.2497f, 16.8074f, 21.25f, 17.3776f, 21.25f)
                horizontalLineTo(18.3153f)
                curveTo(18.8315f, 21.25f, 19.25f, 20.8315f, 19.25f, 20.3153f)
                curveTo(19.25f, 19.8865f, 18.9581f, 19.5126f, 18.542f, 19.4086f)
                lineTo(17.0684f, 19.0402f)
                curveTo(17.0408f, 19.0333f, 17.0136f, 19.0265f, 16.9866f, 19.0198f)
                curveTo(16.511f, 18.9012f, 16.1357f, 18.8077f, 15.8003f, 18.6143f)
                curveTo(15.7f, 18.5565f, 15.6035f, 18.4924f, 15.5114f, 18.4224f)
                curveTo(15.203f, 18.1884f, 14.9711f, 17.8788f, 14.6773f, 17.4864f)
                curveTo(14.6606f, 17.4642f, 14.6438f, 17.4417f, 14.6267f, 17.4189f)
                lineTo(13.9f, 16.45f)
                curveTo(13.6515f, 16.1186f, 13.7186f, 15.6485f, 14.05f, 15.4f)
                curveTo(14.3814f, 15.1515f, 14.8515f, 15.2186f, 15.1f, 15.55f)
                lineTo(15.8267f, 16.5189f)
                curveTo(16.1952f, 17.0103f, 16.2982f, 17.1365f, 16.4182f, 17.2276f)
                curveTo(16.4601f, 17.2594f, 16.504f, 17.2885f, 16.5496f, 17.3148f)
                curveTo(16.6801f, 17.3901f, 16.8364f, 17.436f, 17.4322f, 17.585f)
                lineTo(18.9058f, 17.9534f)
                curveTo(19.9897f, 18.2243f, 20.75f, 19.1982f, 20.75f, 20.3153f)
                curveTo(20.75f, 21.66f, 19.66f, 22.75f, 18.3153f, 22.75f)
                horizontalLineTo(17.3524f)
                curveTo(16.8139f, 22.75f, 16.5133f, 22.75f, 16.2136f, 22.7333f)
                curveTo(15.3283f, 22.6838f, 14.4525f, 22.525f, 13.6062f, 22.2605f)
                curveTo(13.3197f, 22.1709f, 13.0382f, 22.0653f, 12.534f, 21.8762f)
                lineTo(11.1016f, 21.3391f)
                curveTo(9.6981f, 22.2575f, 8.0537f, 22.75f, 6.3684f, 22.75f)
                horizontalLineTo(5.6847f)
                curveTo(4.34f, 22.75f, 3.25f, 21.66f, 3.25f, 20.3153f)
                curveTo(3.25f, 19.1982f, 4.0103f, 18.2243f, 5.0942f, 17.9534f)
                lineTo(6.8876f, 17.505f)
                curveTo(7.1433f, 17.4411f, 7.2116f, 17.4227f, 7.2718f, 17.3997f)
                curveTo(7.445f, 17.3337f, 7.6013f, 17.2299f, 7.7294f, 17.096f)
                curveTo(7.7739f, 17.0493f, 7.8174f, 16.9935f, 7.9755f, 16.7827f)
                lineTo(8.9f, 15.55f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0002f, 9.7705f)
                curveTo(11.644f, 9.7705f, 11.3211f, 9.791f, 11.1392f, 9.8218f)
                lineTo(10.2476f, 9.972f)
                curveTo(8.2351f, 10.3109f, 6.7502f, 12.0735f, 6.7502f, 14.1501f)
                curveTo(6.7502f, 15.2309f, 6.2157f, 16.2434f, 5.3207f, 16.8463f)
                lineTo(5.2194f, 16.9145f)
                curveTo(4.9647f, 17.0861f, 4.6882f, 17.2228f, 4.3973f, 17.3207f)
                lineTo(3.2396f, 17.7107f)
                curveTo(2.8471f, 17.8429f, 2.4216f, 17.6319f, 2.2894f, 17.2393f)
                curveTo(2.1572f, 16.8468f, 2.3683f, 16.4214f, 2.7608f, 16.2891f)
                lineTo(3.9185f, 15.8992f)
                curveTo(4.082f, 15.8441f, 4.2377f, 15.7672f, 4.3814f, 15.6704f)
                lineTo(4.4826f, 15.6022f)
                curveTo(4.9602f, 15.2805f, 5.2502f, 14.7363f, 5.2502f, 14.1501f)
                curveTo(5.2502f, 11.3525f, 7.2528f, 8.9552f, 9.9985f, 8.4928f)
                lineTo(10.8885f, 8.3429f)
                curveTo(11.1929f, 8.2914f, 11.6133f, 8.2705f, 12.0002f, 8.2705f)
                curveTo(12.3869f, 8.2705f, 12.8071f, 8.2912f, 13.1116f, 8.3429f)
                lineTo(14.0019f, 8.4928f)
                curveTo(16.7476f, 8.9552f, 18.7502f, 11.3525f, 18.7502f, 14.1501f)
                curveTo(18.7502f, 14.7363f, 19.0402f, 15.2805f, 19.5178f, 15.6022f)
                lineTo(19.619f, 15.6704f)
                curveTo(19.7627f, 15.7672f, 19.9184f, 15.8441f, 20.0819f, 15.8992f)
                lineTo(21.2396f, 16.2891f)
                curveTo(21.6321f, 16.4214f, 21.8432f, 16.8468f, 21.711f, 17.2393f)
                curveTo(21.5788f, 17.6319f, 21.1534f, 17.8429f, 20.7608f, 17.7107f)
                lineTo(19.6031f, 17.3207f)
                curveTo(19.3122f, 17.2228f, 19.0357f, 17.0861f, 18.781f, 16.9145f)
                lineTo(18.6797f, 16.8463f)
                curveTo(17.7847f, 16.2434f, 17.2502f, 15.2309f, 17.2502f, 14.1501f)
                curveTo(17.2502f, 12.0735f, 15.7653f, 10.3109f, 13.7528f, 9.972f)
                lineTo(12.861f, 9.8218f)
                curveTo(12.6793f, 9.7909f, 12.3565f, 9.7705f, 12.0002f, 9.7705f)
                close()
            }
        }
        .build()
        return _meditationRound!!
    }

private var _meditationRound: ImageVector? = null
