package dev.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.SportsGroup

val SportsGroup.Dumbbells: ImageVector
    get() {
        if (_dumbbells != null) {
            return _dumbbells!!
        }
        _dumbbells = Builder(
            name = "Dumbbells", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.3447f, 8.9302f)
                lineTo(16.6892f, 6.0902f)
                lineTo(16.6892f, 6.0901f)
                curveTo(16.7694f, 5.4285f, 16.8096f, 5.0977f, 16.7403f, 4.8227f)
                curveTo(16.6479f, 4.456f, 16.4234f, 4.1436f, 16.116f, 3.9543f)
                curveTo(15.8855f, 3.8123f, 15.5766f, 3.7693f, 14.9589f, 3.6834f)
                curveTo(14.3412f, 3.5974f, 14.0323f, 3.5544f, 13.7756f, 3.6286f)
                curveTo(13.4333f, 3.7276f, 13.1417f, 3.9681f, 12.9649f, 4.2973f)
                curveTo(12.8323f, 4.5442f, 12.7492f, 5.2301f, 12.6689f, 5.8917f)
                lineTo(6.5374f, 5.0385f)
                curveTo(6.6176f, 4.3769f, 6.7008f, 3.691f, 6.6315f, 3.416f)
                curveTo(6.5392f, 3.0493f, 6.3146f, 2.737f, 6.0073f, 2.5477f)
                curveTo(5.7768f, 2.4056f, 5.4679f, 2.3627f, 4.8502f, 2.2767f)
                curveTo(4.2325f, 2.1908f, 3.9236f, 2.1478f, 3.6669f, 2.222f)
                curveTo(3.3245f, 2.3209f, 3.0329f, 2.5614f, 2.8562f, 2.8907f)
                curveTo(2.7236f, 3.1376f, 2.6835f, 3.4684f, 2.6032f, 4.1301f)
                lineTo(2.2588f, 6.9701f)
                curveTo(2.1785f, 7.6318f, 2.1384f, 7.9626f, 2.2077f, 8.2376f)
                curveTo(2.3f, 8.6043f, 2.5246f, 8.9167f, 2.8319f, 9.106f)
                curveTo(3.0625f, 9.248f, 3.3713f, 9.291f, 3.989f, 9.3769f)
                lineTo(3.989f, 9.3769f)
                lineTo(3.989f, 9.3769f)
                curveTo(4.6068f, 9.4629f, 4.9156f, 9.5059f, 5.1723f, 9.4317f)
                curveTo(5.5147f, 9.3328f, 5.8063f, 9.0922f, 5.983f, 8.763f)
                curveTo(6.1156f, 8.5161f, 6.1988f, 7.8302f, 6.279f, 7.1686f)
                lineTo(12.4106f, 8.0218f)
                curveTo(12.3303f, 8.6834f, 12.2471f, 9.3693f, 12.3164f, 9.6443f)
                curveTo(12.4088f, 10.011f, 12.6333f, 10.3233f, 12.9407f, 10.5127f)
                curveTo(13.1712f, 10.6547f, 13.4801f, 10.6976f, 14.0978f, 10.7836f)
                lineTo(14.0978f, 10.7836f)
                lineTo(14.0978f, 10.7836f)
                curveTo(14.7155f, 10.8695f, 15.0244f, 10.9125f, 15.2811f, 10.8383f)
                curveTo(15.6234f, 10.7394f, 15.915f, 10.4989f, 16.0918f, 10.1696f)
                curveTo(16.2244f, 9.9227f, 16.2645f, 9.5919f, 16.3447f, 8.9303f)
                lineTo(16.3447f, 8.9302f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(7.7611f, 19.925f)
                lineTo(7.0691f, 17.1586f)
                curveTo(6.9079f, 16.5142f, 6.8273f, 16.1919f, 6.862f, 15.9095f)
                curveTo(6.9082f, 15.533f, 7.0923f, 15.1916f, 7.3736f, 14.9604f)
                curveTo(7.5845f, 14.787f, 7.8854f, 14.7006f, 8.4871f, 14.5279f)
                curveTo(9.0887f, 14.3552f, 9.3896f, 14.2689f, 9.6532f, 14.3061f)
                curveTo(10.0047f, 14.3556f, 10.3235f, 14.5528f, 10.5393f, 14.8541f)
                curveTo(10.7012f, 15.08f, 10.8683f, 15.7481f, 11.0296f, 16.3926f)
                lineTo(17.0019f, 14.6784f)
                curveTo(16.8407f, 14.0339f, 16.6736f, 13.3659f, 16.7083f, 13.0835f)
                curveTo(16.7546f, 12.707f, 16.9386f, 12.3656f, 17.2199f, 12.1344f)
                curveTo(17.4309f, 11.961f, 17.7317f, 11.8746f, 18.3334f, 11.7019f)
                curveTo(18.9351f, 11.5292f, 19.2359f, 11.4429f, 19.4996f, 11.4801f)
                curveTo(19.8511f, 11.5296f, 20.1698f, 11.7268f, 20.3857f, 12.0281f)
                curveTo(20.5476f, 12.254f, 20.6282f, 12.5763f, 20.7894f, 13.2208f)
                lineTo(21.4814f, 15.9871f)
                curveTo(21.6426f, 16.6316f, 21.7232f, 16.9539f, 21.6885f, 17.2363f)
                curveTo(21.6423f, 17.6128f, 21.4582f, 17.9542f, 21.1769f, 18.1854f)
                curveTo(20.966f, 18.3588f, 20.6651f, 18.4451f, 20.0635f, 18.6178f)
                lineTo(20.0634f, 18.6178f)
                lineTo(20.0634f, 18.6178f)
                curveTo(19.4618f, 18.7905f, 19.1609f, 18.8769f, 18.8973f, 18.8397f)
                curveTo(18.5457f, 18.7901f, 18.227f, 18.593f, 18.0112f, 18.2917f)
                curveTo(17.8493f, 18.0657f, 17.6822f, 17.3977f, 17.5209f, 16.7532f)
                lineTo(11.5486f, 18.4673f)
                curveTo(11.7098f, 19.1118f, 11.8769f, 19.7799f, 11.8422f, 20.0623f)
                curveTo(11.7959f, 20.4388f, 11.6119f, 20.7802f, 11.3306f, 21.0114f)
                curveTo(11.1196f, 21.1848f, 10.8188f, 21.2711f, 10.2171f, 21.4438f)
                lineTo(10.2171f, 21.4438f)
                lineTo(10.2171f, 21.4438f)
                curveTo(9.6154f, 21.6165f, 9.3146f, 21.7029f, 9.0509f, 21.6657f)
                curveTo(8.6994f, 21.6161f, 8.3806f, 21.419f, 8.1648f, 21.1177f)
                curveTo(8.0029f, 20.8917f, 7.9223f, 20.5695f, 7.7611f, 19.925f)
                close()
            }
        }
            .build()
        return _dumbbells!!
    }

private var _dumbbells: ImageVector? = null
