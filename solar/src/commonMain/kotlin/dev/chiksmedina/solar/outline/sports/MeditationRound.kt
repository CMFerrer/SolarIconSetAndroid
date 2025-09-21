package dev.chiksmedina.solar.outline.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.SportsGroup

val SportsGroup.MeditationRound: ImageVector
    get() {
        if (_meditationRound != null) {
            return _meditationRound!!
        }
        _meditationRound = Builder(
            name = "MeditationRound", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 2.75f)
                curveTo(11.0335f, 2.75f, 10.25f, 3.5335f, 10.25f, 4.5f)
                curveTo(10.25f, 5.4665f, 11.0335f, 6.25f, 12.0f, 6.25f)
                curveTo(12.9665f, 6.25f, 13.75f, 5.4665f, 13.75f, 4.5f)
                curveTo(13.75f, 3.5335f, 12.9665f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(8.75f, 4.5f)
                curveTo(8.75f, 2.7051f, 10.2051f, 1.25f, 12.0f, 1.25f)
                curveTo(13.7949f, 1.25f, 15.25f, 2.7051f, 15.25f, 4.5f)
                curveTo(15.25f, 6.2949f, 13.7949f, 7.75f, 12.0f, 7.75f)
                curveTo(10.2051f, 7.75f, 8.75f, 6.2949f, 8.75f, 4.5f)
                close()
                moveTo(12.0001f, 9.7706f)
                curveTo(11.6439f, 9.7706f, 11.3209f, 9.7911f, 11.139f, 9.8219f)
                lineTo(10.2474f, 9.9721f)
                curveTo(8.2349f, 10.311f, 6.75f, 12.0736f, 6.75f, 14.1502f)
                curveTo(6.75f, 15.231f, 6.2155f, 16.2435f, 5.3205f, 16.8464f)
                lineTo(5.2193f, 16.9146f)
                curveTo(4.9645f, 17.0862f, 4.688f, 17.2229f, 4.3971f, 17.3208f)
                lineTo(3.2394f, 17.7108f)
                curveTo(2.8469f, 17.843f, 2.4215f, 17.6319f, 2.2892f, 17.2394f)
                curveTo(2.157f, 16.8469f, 2.3681f, 16.4214f, 2.7606f, 16.2892f)
                lineTo(3.9183f, 15.8993f)
                curveTo(4.0818f, 15.8442f, 4.2375f, 15.7673f, 4.3812f, 15.6705f)
                lineTo(4.4825f, 15.6023f)
                curveTo(4.9601f, 15.2806f, 5.25f, 14.7364f, 5.25f, 14.1502f)
                curveTo(5.25f, 11.3526f, 7.2526f, 8.9553f, 9.9983f, 8.4929f)
                lineTo(10.8883f, 8.343f)
                curveTo(10.8884f, 8.343f, 10.8882f, 8.3431f, 10.8883f, 8.343f)
                curveTo(11.1927f, 8.2915f, 11.6131f, 8.2706f, 12.0f, 8.2706f)
                curveTo(12.3868f, 8.2706f, 12.807f, 8.2913f, 13.1116f, 8.343f)
                curveTo(13.1117f, 8.343f, 13.1115f, 8.343f, 13.1116f, 8.343f)
                lineTo(14.0017f, 8.4929f)
                curveTo(16.7474f, 8.9553f, 18.75f, 11.3526f, 18.75f, 14.1502f)
                curveTo(18.75f, 14.7364f, 19.04f, 15.2806f, 19.5176f, 15.6023f)
                lineTo(19.6188f, 15.6705f)
                curveTo(19.7626f, 15.7673f, 19.9182f, 15.8442f, 20.0817f, 15.8993f)
                lineTo(21.2394f, 16.2892f)
                curveTo(21.632f, 16.4214f, 21.843f, 16.8469f, 21.7108f, 17.2394f)
                curveTo(21.5786f, 17.6319f, 21.1532f, 17.843f, 20.7606f, 17.7108f)
                lineTo(19.6029f, 17.3208f)
                curveTo(19.312f, 17.2229f, 19.0356f, 17.0862f, 18.7808f, 16.9146f)
                lineTo(18.6795f, 16.8464f)
                curveTo(17.7845f, 16.2435f, 17.25f, 15.231f, 17.25f, 14.1502f)
                curveTo(17.25f, 12.0736f, 15.7652f, 10.311f, 13.7526f, 9.9721f)
                lineTo(12.8609f, 9.8219f)
                curveTo(12.6791f, 9.791f, 12.3563f, 9.7706f, 12.0001f, 9.7706f)
                close()
                moveTo(8.9f, 15.55f)
                curveTo(9.1486f, 15.2186f, 9.6187f, 15.1515f, 9.95f, 15.4f)
                curveTo(10.2814f, 15.6485f, 10.3485f, 16.1186f, 10.1f, 16.45f)
                lineTo(9.1755f, 17.6827f)
                curveTo(9.1682f, 17.6925f, 9.1609f, 17.7022f, 9.1538f, 17.7117f)
                curveTo(9.0273f, 17.8804f, 8.9279f, 18.013f, 8.8133f, 18.1328f)
                curveTo(8.5315f, 18.4274f, 8.1877f, 18.6557f, 7.8068f, 18.8011f)
                curveTo(7.6519f, 18.8602f, 7.4911f, 18.9004f, 7.2866f, 18.9514f)
                curveTo(7.275f, 18.9543f, 7.2633f, 18.9573f, 7.2514f, 18.9602f)
                lineTo(5.458f, 19.4086f)
                curveTo(5.0419f, 19.5126f, 4.75f, 19.8865f, 4.75f, 20.3153f)
                curveTo(4.75f, 20.8315f, 5.1685f, 21.25f, 5.6847f, 21.25f)
                horizontalLineTo(6.3684f)
                curveTo(7.9144f, 21.25f, 9.4186f, 20.7486f, 10.6553f, 19.8211f)
                lineTo(12.55f, 18.4f)
                curveTo(12.8814f, 18.1515f, 13.3515f, 18.2186f, 13.6f, 18.55f)
                curveTo(13.8485f, 18.8814f, 13.7814f, 19.3515f, 13.45f, 19.6f)
                lineTo(12.5454f, 20.2785f)
                lineTo(13.0371f, 20.4629f)
                curveTo(13.571f, 20.6631f, 13.8118f, 20.7531f, 14.0538f, 20.8288f)
                curveTo(14.782f, 21.0564f, 15.5355f, 21.193f, 16.2973f, 21.2356f)
                curveTo(16.5504f, 21.2497f, 16.8074f, 21.25f, 17.3777f, 21.25f)
                horizontalLineTo(18.3154f)
                curveTo(18.8316f, 21.25f, 19.25f, 20.8315f, 19.25f, 20.3153f)
                curveTo(19.25f, 19.8865f, 18.9581f, 19.5126f, 18.5421f, 19.4086f)
                lineTo(17.0685f, 19.0402f)
                curveTo(17.0408f, 19.0333f, 17.0136f, 19.0265f, 16.9866f, 19.0198f)
                curveTo(16.511f, 18.9012f, 16.1357f, 18.8076f, 15.8003f, 18.6143f)
                curveTo(15.7001f, 18.5565f, 15.6036f, 18.4924f, 15.5114f, 18.4224f)
                curveTo(15.203f, 18.1884f, 14.9712f, 17.8788f, 14.6773f, 17.4864f)
                curveTo(14.6607f, 17.4642f, 14.6438f, 17.4417f, 14.6267f, 17.4189f)
                lineTo(13.9f, 16.45f)
                curveTo(13.6515f, 16.1186f, 13.7186f, 15.6485f, 14.05f, 15.4f)
                curveTo(14.3814f, 15.1515f, 14.8515f, 15.2186f, 15.1f, 15.55f)
                lineTo(15.8267f, 16.5189f)
                curveTo(16.1952f, 17.0103f, 16.2982f, 17.1365f, 16.4182f, 17.2276f)
                curveTo(16.4601f, 17.2594f, 16.504f, 17.2885f, 16.5496f, 17.3148f)
                curveTo(16.6801f, 17.3901f, 16.8364f, 17.436f, 17.4323f, 17.585f)
                lineTo(18.9059f, 17.9534f)
                curveTo(19.9897f, 18.2243f, 20.75f, 19.1982f, 20.75f, 20.3153f)
                curveTo(20.75f, 21.66f, 19.66f, 22.75f, 18.3154f, 22.75f)
                horizontalLineTo(17.3523f)
                curveTo(16.8139f, 22.75f, 16.5133f, 22.75f, 16.2136f, 22.7333f)
                curveTo(15.3283f, 22.6838f, 14.4525f, 22.525f, 13.6063f, 22.2605f)
                curveTo(13.3197f, 22.1709f, 13.0383f, 22.0654f, 12.5342f, 21.8763f)
                lineTo(11.1016f, 21.3391f)
                curveTo(9.6981f, 22.2575f, 8.0537f, 22.75f, 6.3684f, 22.75f)
                horizontalLineTo(5.6847f)
                curveTo(4.3401f, 22.75f, 3.25f, 21.66f, 3.25f, 20.3153f)
                curveTo(3.25f, 19.1982f, 4.0104f, 18.2243f, 5.0942f, 17.9534f)
                lineTo(6.8876f, 17.505f)
                curveTo(7.1433f, 17.4411f, 7.2116f, 17.4227f, 7.2718f, 17.3997f)
                curveTo(7.445f, 17.3337f, 7.6013f, 17.2299f, 7.7294f, 17.096f)
                curveTo(7.774f, 17.0493f, 7.8174f, 16.9935f, 7.9755f, 16.7827f)
                lineTo(8.9f, 15.55f)
                close()
            }
        }
            .build()
        return _meditationRound!!
    }

private var _meditationRound: ImageVector? = null
