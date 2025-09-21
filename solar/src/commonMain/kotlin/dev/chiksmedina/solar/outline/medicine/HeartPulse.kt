package dev.chiksmedina.solar.outline.medicine

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
import dev.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.HeartPulse: ImageVector
    get() {
        if (_heartPulse != null) {
            return _heartPulse!!
        }
        _heartPulse = Builder(
            name = "HeartPulse", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(10.0932f, 10.7463f)
                curveTo(10.1827f, 10.6184f, 10.2571f, 10.5122f, 10.3233f, 10.4213f)
                curveTo(10.3793f, 10.5188f, 10.4418f, 10.6324f, 10.517f, 10.7692f)
                lineTo(12.2273f, 13.8788f)
                curveTo(12.3933f, 14.1809f, 12.5562f, 14.4771f, 12.7197f, 14.6921f)
                curveTo(12.8947f, 14.9222f, 13.2023f, 15.2374f, 13.6954f, 15.2467f)
                curveTo(14.1884f, 15.2559f, 14.5077f, 14.9525f, 14.6912f, 14.7292f)
                curveTo(14.8627f, 14.5205f, 15.0365f, 14.2305f, 15.2138f, 13.9349f)
                lineTo(15.2692f, 13.8426f)
                curveTo(15.49f, 13.4745f, 15.629f, 13.2445f, 15.752f, 13.0783f)
                curveTo(15.8654f, 12.9251f, 15.9309f, 12.8752f, 15.9798f, 12.8475f)
                curveTo(16.0286f, 12.8198f, 16.1052f, 12.7894f, 16.2948f, 12.771f)
                curveTo(16.5006f, 12.751f, 16.7694f, 12.7501f, 17.1986f, 12.7501f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 12.7501f, 18.75f, 12.4144f, 18.75f, 12.0001f)
                curveTo(18.75f, 11.5859f, 18.4142f, 11.2501f, 18.0f, 11.2501f)
                lineTo(17.1662f, 11.2501f)
                curveTo(16.7791f, 11.2501f, 16.4367f, 11.2501f, 16.1497f, 11.278f)
                curveTo(15.8385f, 11.3082f, 15.5357f, 11.3752f, 15.2407f, 11.5422f)
                curveTo(14.9457f, 11.7092f, 14.7325f, 11.9345f, 14.5465f, 12.1857f)
                curveTo(14.3749f, 12.4175f, 14.1988f, 12.7111f, 13.9996f, 13.0431f)
                lineTo(13.9521f, 13.1223f)
                curveTo(13.8654f, 13.2668f, 13.793f, 13.3872f, 13.7284f, 13.4906f)
                curveTo(13.6676f, 13.3849f, 13.5999f, 13.2618f, 13.5186f, 13.1141f)
                lineTo(11.8092f, 10.006f)
                curveTo(11.6551f, 9.7256f, 11.5015f, 9.4463f, 11.3458f, 9.2415f)
                curveTo(11.1756f, 9.0178f, 10.8839f, 8.722f, 10.4164f, 8.6967f)
                curveTo(9.9489f, 8.6715f, 9.627f, 8.9342f, 9.4337f, 9.1383f)
                curveTo(9.2568f, 9.3251f, 9.0741f, 9.5863f, 8.8907f, 9.8484f)
                lineTo(8.5813f, 10.2904f)
                curveTo(8.3542f, 10.6149f, 8.2118f, 10.8171f, 8.0885f, 10.9629f)
                curveTo(7.975f, 11.0972f, 7.9119f, 11.1411f, 7.8654f, 11.1654f)
                curveTo(7.8188f, 11.1896f, 7.7466f, 11.2161f, 7.5716f, 11.2321f)
                curveTo(7.3814f, 11.2494f, 7.1341f, 11.2501f, 6.738f, 11.2501f)
                horizontalLineTo(6.0f)
                curveTo(5.5858f, 11.2501f, 5.25f, 11.5859f, 5.25f, 12.0001f)
                curveTo(5.25f, 12.4144f, 5.5858f, 12.7501f, 6.0f, 12.7501f)
                lineTo(6.7681f, 12.7501f)
                curveTo(7.1251f, 12.7502f, 7.4415f, 12.7502f, 7.708f, 12.7258f)
                curveTo(7.9971f, 12.6994f, 8.279f, 12.6411f, 8.5581f, 12.4958f)
                curveTo(8.8371f, 12.3506f, 9.0466f, 12.153f, 9.234f, 11.9313f)
                curveTo(9.4068f, 11.727f, 9.5882f, 11.4677f, 9.7929f, 11.1753f)
                lineTo(10.0932f, 10.7463f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(22.75f, 9.2604f)
                curveTo(22.75f, 6.0793f, 21.2578f, 3.6064f, 18.9755f, 2.6569f)
                curveTo(16.8461f, 1.7711f, 14.2743f, 2.3096f, 12.0f, 4.4368f)
                curveTo(9.7257f, 2.3096f, 7.1539f, 1.7711f, 5.0245f, 2.657f)
                curveTo(2.7422f, 3.6065f, 1.25f, 6.0794f, 1.25f, 9.2605f)
                curveTo(1.25f, 11.3863f, 2.3793f, 13.4794f, 3.7862f, 15.2825f)
                curveTo(5.2074f, 17.1039f, 6.9953f, 18.735f, 8.4878f, 19.952f)
                lineTo(8.6225f, 20.062f)
                curveTo(9.8223f, 21.0418f, 10.6895f, 21.75f, 12.0f, 21.75f)
                curveTo(13.3105f, 21.75f, 14.1777f, 21.0418f, 15.3775f, 20.062f)
                lineTo(15.5123f, 19.952f)
                curveTo(17.0047f, 18.735f, 18.7926f, 17.104f, 20.2138f, 15.2826f)
                curveTo(21.6207f, 13.4794f, 22.75f, 11.3863f, 22.75f, 9.2604f)
                close()
                moveTo(12.5491f, 6.0097f)
                curveTo(14.6472f, 3.7548f, 16.827f, 3.3878f, 18.3994f, 4.0419f)
                curveTo(19.9921f, 4.7045f, 21.25f, 6.5305f, 21.25f, 9.2604f)
                curveTo(21.25f, 10.8822f, 20.3695f, 12.6446f, 19.0312f, 14.3598f)
                curveTo(17.7071f, 16.0569f, 16.0142f, 17.6072f, 14.5643f, 18.7895f)
                curveTo(13.1713f, 19.9255f, 12.7216f, 20.25f, 12.0f, 20.25f)
                curveTo(11.2785f, 20.25f, 10.8287f, 19.9255f, 9.4357f, 18.7895f)
                curveTo(7.9858f, 17.6072f, 6.2929f, 16.0568f, 4.9688f, 14.3598f)
                curveTo(3.6305f, 12.6445f, 2.75f, 10.8821f, 2.75f, 9.2605f)
                curveTo(2.75f, 6.5306f, 4.0079f, 4.7046f, 5.6006f, 4.0419f)
                curveTo(7.173f, 3.3878f, 9.3528f, 3.7548f, 11.4509f, 6.0097f)
                curveTo(11.5928f, 6.1622f, 11.7917f, 6.2488f, 12.0f, 6.2488f)
                curveTo(12.2083f, 6.2488f, 12.4072f, 6.1622f, 12.5491f, 6.0097f)
                close()
            }
        }
            .build()
        return _heartPulse!!
    }

private var _heartPulse: ImageVector? = null
