package dev.chiksmedina.solar.bold.sports

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
import dev.chiksmedina.solar.bold.SportsGroup

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
                pathFillType = NonZero
            ) {
                moveTo(14.5f, 4.5f)
                curveTo(14.5f, 5.8807f, 13.3807f, 7.0f, 12.0f, 7.0f)
                curveTo(10.6192f, 7.0f, 9.5f, 5.8807f, 9.5f, 4.5f)
                curveTo(9.5f, 3.1193f, 10.6192f, 2.0f, 12.0f, 2.0f)
                curveTo(13.3807f, 2.0f, 14.5f, 3.1193f, 14.5f, 4.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.0f, 9.7706f)
                curveTo(11.6438f, 9.7706f, 11.3209f, 9.7911f, 11.1389f, 9.8219f)
                lineTo(10.2473f, 9.9721f)
                curveTo(8.2348f, 10.311f, 6.75f, 12.0736f, 6.75f, 14.1502f)
                curveTo(6.75f, 15.231f, 6.2154f, 16.2435f, 5.3204f, 16.8464f)
                lineTo(5.2192f, 16.9146f)
                curveTo(4.9644f, 17.0862f, 4.688f, 17.2229f, 4.3971f, 17.3208f)
                lineTo(3.2394f, 17.7108f)
                curveTo(2.8468f, 17.843f, 2.4214f, 17.6319f, 2.2892f, 17.2394f)
                curveTo(2.157f, 16.8469f, 2.368f, 16.4215f, 2.7606f, 16.2892f)
                lineTo(3.9183f, 15.8993f)
                curveTo(4.0817f, 15.8442f, 4.2374f, 15.7673f, 4.3812f, 15.6705f)
                lineTo(4.4824f, 15.6023f)
                curveTo(4.96f, 15.2806f, 5.25f, 14.7364f, 5.25f, 14.1502f)
                curveTo(5.25f, 11.3526f, 7.2526f, 8.9553f, 9.9982f, 8.4929f)
                lineTo(10.8882f, 8.343f)
                verticalLineTo(8.343f)
                curveTo(11.1926f, 8.2915f, 11.6131f, 8.2706f, 11.9999f, 8.2706f)
                curveTo(12.3867f, 8.2706f, 12.8068f, 8.2913f, 13.1114f, 8.343f)
                verticalLineTo(8.343f)
                lineTo(14.0017f, 8.4929f)
                curveTo(16.7474f, 8.9553f, 18.75f, 11.3526f, 18.75f, 14.1502f)
                curveTo(18.75f, 14.7364f, 19.0399f, 15.2806f, 19.5175f, 15.6023f)
                lineTo(19.6188f, 15.6705f)
                curveTo(19.7625f, 15.7673f, 19.9182f, 15.8442f, 20.0817f, 15.8993f)
                lineTo(21.2394f, 16.2892f)
                curveTo(21.6319f, 16.4215f, 21.8429f, 16.8469f, 21.7107f, 17.2394f)
                curveTo(21.5785f, 17.6319f, 21.1531f, 17.843f, 20.7606f, 17.7108f)
                lineTo(19.6029f, 17.3208f)
                curveTo(19.312f, 17.2229f, 19.0355f, 17.0862f, 18.7807f, 16.9146f)
                lineTo(18.6795f, 16.8464f)
                curveTo(17.7845f, 16.2435f, 17.25f, 15.231f, 17.25f, 14.1502f)
                curveTo(17.25f, 12.0736f, 15.7651f, 10.311f, 13.7526f, 9.9721f)
                lineTo(12.8608f, 9.8219f)
                curveTo(12.679f, 9.791f, 12.3562f, 9.7706f, 12.0f, 9.7706f)
                close()
                moveTo(8.9f, 15.55f)
                curveTo(9.1485f, 15.2186f, 9.6186f, 15.1515f, 9.95f, 15.4f)
                curveTo(10.2813f, 15.6485f, 10.3485f, 16.1186f, 10.1f, 16.45f)
                lineTo(9.1755f, 17.6827f)
                curveTo(9.1681f, 17.6925f, 9.1609f, 17.7021f, 9.1537f, 17.7117f)
                curveTo(9.0273f, 17.8804f, 8.9278f, 18.013f, 8.8133f, 18.1328f)
                curveTo(8.5315f, 18.4274f, 8.1876f, 18.6557f, 7.8067f, 18.8011f)
                curveTo(7.6519f, 18.8602f, 7.491f, 18.9004f, 7.2865f, 18.9514f)
                curveTo(7.275f, 18.9543f, 7.2632f, 18.9573f, 7.2513f, 18.9602f)
                lineTo(5.4579f, 19.4086f)
                curveTo(5.0419f, 19.5126f, 4.75f, 19.8865f, 4.75f, 20.3153f)
                curveTo(4.75f, 20.8315f, 5.1684f, 21.25f, 5.6846f, 21.25f)
                horizontalLineTo(6.3684f)
                curveTo(7.9143f, 21.25f, 9.4185f, 20.7486f, 10.6552f, 19.8211f)
                lineTo(12.55f, 18.4f)
                curveTo(12.8813f, 18.1515f, 13.3514f, 18.2186f, 13.6f, 18.55f)
                curveTo(13.8485f, 18.8814f, 13.7813f, 19.3515f, 13.45f, 19.6f)
                lineTo(12.5453f, 20.2785f)
                lineTo(13.0371f, 20.4629f)
                curveTo(13.571f, 20.6631f, 13.8118f, 20.7531f, 14.0537f, 20.8288f)
                curveTo(14.7819f, 21.0564f, 15.5355f, 21.193f, 16.2972f, 21.2356f)
                curveTo(16.5503f, 21.2497f, 16.8074f, 21.25f, 17.3776f, 21.25f)
                horizontalLineTo(18.3153f)
                curveTo(18.8315f, 21.25f, 19.25f, 20.8315f, 19.25f, 20.3153f)
                curveTo(19.25f, 19.8865f, 18.9581f, 19.5126f, 18.542f, 19.4086f)
                lineTo(17.0684f, 19.0402f)
                curveTo(17.0408f, 19.0333f, 17.0135f, 19.0265f, 16.9866f, 19.0198f)
                curveTo(16.5109f, 18.9012f, 16.1356f, 18.8077f, 15.8003f, 18.6143f)
                curveTo(15.7f, 18.5565f, 15.6035f, 18.4924f, 15.5113f, 18.4224f)
                curveTo(15.203f, 18.1884f, 14.9711f, 17.8788f, 14.6772f, 17.4864f)
                curveTo(14.6606f, 17.4642f, 14.6437f, 17.4417f, 14.6267f, 17.4189f)
                lineTo(13.9f, 16.45f)
                curveTo(13.6514f, 16.1186f, 13.7186f, 15.6485f, 14.05f, 15.4f)
                curveTo(14.3813f, 15.1515f, 14.8514f, 15.2186f, 15.1f, 15.55f)
                lineTo(15.8267f, 16.5189f)
                curveTo(16.1952f, 17.0103f, 16.2982f, 17.1365f, 16.4182f, 17.2276f)
                curveTo(16.4601f, 17.2594f, 16.5039f, 17.2885f, 16.5495f, 17.3148f)
                curveTo(16.68f, 17.3901f, 16.8364f, 17.436f, 17.4322f, 17.585f)
                lineTo(18.9058f, 17.9534f)
                curveTo(19.9896f, 18.2243f, 20.75f, 19.1982f, 20.75f, 20.3153f)
                curveTo(20.75f, 21.66f, 19.6599f, 22.75f, 18.3153f, 22.75f)
                horizontalLineTo(17.3524f)
                curveTo(16.8139f, 22.75f, 16.5133f, 22.75f, 16.2135f, 22.7333f)
                curveTo(15.3282f, 22.6838f, 14.4525f, 22.525f, 13.6062f, 22.2605f)
                curveTo(13.3196f, 22.1709f, 13.0382f, 22.0653f, 12.534f, 21.8762f)
                lineTo(11.1016f, 21.3391f)
                curveTo(9.698f, 22.2575f, 8.0537f, 22.75f, 6.3684f, 22.75f)
                horizontalLineTo(5.6846f)
                curveTo(4.34f, 22.75f, 3.25f, 21.66f, 3.25f, 20.3153f)
                curveTo(3.25f, 19.1982f, 4.0103f, 18.2243f, 5.0941f, 17.9534f)
                lineTo(6.8875f, 17.505f)
                curveTo(7.1432f, 17.4411f, 7.2115f, 17.4227f, 7.2718f, 17.3997f)
                curveTo(7.4449f, 17.3337f, 7.6012f, 17.2299f, 7.7293f, 17.096f)
                curveTo(7.7739f, 17.0493f, 7.8173f, 16.9935f, 7.9755f, 16.7827f)
                lineTo(8.9f, 15.55f)
                close()
            }
        }
            .build()
        return _meditationRound!!
    }

private var _meditationRound: ImageVector? = null
