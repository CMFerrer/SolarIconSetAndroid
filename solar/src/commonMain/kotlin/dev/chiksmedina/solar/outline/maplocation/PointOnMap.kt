package dev.chiksmedina.solar.outline.maplocation

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.outline.MapLocationGroup

val MapLocationGroup.PointOnMap: ImageVector
    get() {
        if (_pointOnMap != null) {
            return _pointOnMap!!
        }
        _pointOnMap = Builder(
            name = "PointOnMap", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(5.25f, 7.7003f)
                curveTo(5.25f, 4.1021f, 8.3088f, 1.25f, 12.0f, 1.25f)
                curveTo(15.608f, 1.25f, 18.6116f, 3.9749f, 18.7454f, 7.4579f)
                lineTo(19.2231f, 7.6171f)
                curveTo(19.6863f, 7.7715f, 20.0922f, 7.9068f, 20.4142f, 8.0566f)
                curveTo(20.7623f, 8.2185f, 21.0814f, 8.4271f, 21.3253f, 8.7655f)
                curveTo(21.5692f, 9.1039f, 21.6662f, 9.4726f, 21.7098f, 9.8541f)
                curveTo(21.7501f, 10.207f, 21.75f, 10.6348f, 21.75f, 11.123f)
                verticalLineTo(16.8712f)
                curveTo(21.75f, 17.4806f, 21.7501f, 18.0005f, 21.7028f, 18.4176f)
                curveTo(21.653f, 18.8563f, 21.5418f, 19.2875f, 21.2404f, 19.6553f)
                curveTo(21.0674f, 19.8665f, 20.8573f, 20.0445f, 20.6205f, 20.1805f)
                curveTo(20.2081f, 20.4173f, 19.7645f, 20.4561f, 19.3236f, 20.433f)
                curveTo(18.9044f, 20.4111f, 18.3915f, 20.3256f, 17.7904f, 20.2254f)
                lineTo(17.7488f, 20.2185f)
                curveTo(16.456f, 20.003f, 15.9351f, 19.9216f, 15.4274f, 19.9641f)
                curveTo(15.2417f, 19.9796f, 15.0571f, 20.0074f, 14.875f, 20.0471f)
                curveTo(14.3774f, 20.1558f, 13.8988f, 20.3891f, 12.716f, 20.9805f)
                curveTo(12.6749f, 21.0011f, 12.6342f, 21.0214f, 12.594f, 21.0415f)
                curveTo(11.2114f, 21.7331f, 10.3595f, 22.1592f, 9.4403f, 22.2923f)
                curveTo(9.1638f, 22.3323f, 8.8848f, 22.3522f, 8.6055f, 22.3516f)
                curveTo(7.6767f, 22.3499f, 6.78f, 22.0508f, 5.3254f, 21.5657f)
                curveTo(5.2833f, 21.5517f, 5.2407f, 21.5375f, 5.1977f, 21.5231f)
                lineTo(4.8141f, 21.3953f)
                lineTo(4.7768f, 21.3828f)
                curveTo(4.3137f, 21.2285f, 3.9078f, 21.0932f, 3.5858f, 20.9434f)
                curveTo(3.2377f, 20.7815f, 2.9186f, 20.5729f, 2.6747f, 20.2345f)
                curveTo(2.4308f, 19.8961f, 2.3338f, 19.5274f, 2.2902f, 19.1459f)
                curveTo(2.2499f, 18.793f, 2.25f, 18.3652f, 2.25f, 17.877f)
                lineTo(2.25f, 12.8572f)
                curveTo(2.25f, 12.0711f, 2.2499f, 11.4085f, 2.3173f, 10.8895f)
                curveTo(2.3876f, 10.3478f, 2.5465f, 9.8181f, 2.9826f, 9.4198f)
                curveTo(3.1108f, 9.3027f, 3.2521f, 9.2008f, 3.4037f, 9.1163f)
                curveTo(3.9195f, 8.8285f, 4.4723f, 8.8452f, 5.0084f, 8.9498f)
                curveTo(5.1172f, 8.9711f, 5.2311f, 8.9972f, 5.3502f, 9.0275f)
                curveTo(5.2841f, 8.5817f, 5.25f, 8.1372f, 5.25f, 7.7003f)
                close()
                moveTo(5.7487f, 10.7093f)
                curveTo(5.3207f, 10.5713f, 4.9922f, 10.475f, 4.7211f, 10.4221f)
                curveTo(4.326f, 10.345f, 4.1965f, 10.3917f, 4.1346f, 10.4262f)
                curveTo(4.0841f, 10.4544f, 4.0369f, 10.4883f, 3.9942f, 10.5274f)
                curveTo(3.9419f, 10.5751f, 3.8566f, 10.6833f, 3.8048f, 11.0825f)
                curveTo(3.7515f, 11.4933f, 3.75f, 12.0575f, 3.75f, 12.908f)
                verticalLineTo(17.8377f)
                curveTo(3.75f, 18.3768f, 3.7511f, 18.7181f, 3.7806f, 18.9758f)
                curveTo(3.8078f, 19.2143f, 3.8523f, 19.303f, 3.8916f, 19.3574f)
                curveTo(3.9308f, 19.4118f, 4.0008f, 19.4821f, 4.2185f, 19.5834f)
                curveTo(4.4536f, 19.6928f, 4.7771f, 19.8018f, 5.2885f, 19.9723f)
                lineTo(5.672f, 20.1001f)
                curveTo(7.2956f, 20.6413f, 7.9509f, 20.8504f, 8.6083f, 20.8516f)
                curveTo(8.8148f, 20.852f, 9.021f, 20.8374f, 9.2254f, 20.8078f)
                curveTo(9.8758f, 20.7136f, 10.5009f, 20.411f, 12.0452f, 19.6389f)
                curveTo(12.0765f, 19.6232f, 12.1074f, 19.6078f, 12.138f, 19.5925f)
                curveTo(13.1987f, 19.062f, 13.852f, 18.7352f, 14.555f, 18.5817f)
                curveTo(14.8014f, 18.5279f, 15.051f, 18.4903f, 15.3023f, 18.4693f)
                curveTo(16.0193f, 18.4093f, 16.7344f, 18.5286f, 17.8945f, 18.7221f)
                curveTo(17.9278f, 18.7276f, 17.9614f, 18.7332f, 17.9954f, 18.7389f)
                curveTo(18.6497f, 18.8479f, 19.0779f, 18.9181f, 19.4019f, 18.9351f)
                curveTo(19.7138f, 18.9514f, 19.821f, 18.9098f, 19.8735f, 18.8797f)
                curveTo(19.9524f, 18.8344f, 20.0225f, 18.775f, 20.0801f, 18.7046f)
                curveTo(20.1185f, 18.6578f, 20.1771f, 18.5589f, 20.2123f, 18.2486f)
                curveTo(20.2489f, 17.9262f, 20.25f, 17.4923f, 20.25f, 16.829f)
                verticalLineTo(11.1623f)
                curveTo(20.25f, 10.6232f, 20.2489f, 10.2819f, 20.2195f, 10.0242f)
                curveTo(20.1922f, 9.7857f, 20.1477f, 9.697f, 20.1084f, 9.6426f)
                curveTo(20.0692f, 9.5882f, 19.9992f, 9.5179f, 19.7815f, 9.4166f)
                curveTo(19.5464f, 9.3072f, 19.2229f, 9.1982f, 18.7115f, 9.0277f)
                lineTo(18.6527f, 9.0081f)
                curveTo(18.4625f, 10.3095f, 17.9996f, 11.6233f, 17.3173f, 12.7959f)
                curveTo(16.4048f, 14.364f, 15.0697f, 15.7299f, 13.3971f, 16.4595f)
                curveTo(12.5094f, 16.8468f, 11.4906f, 16.8468f, 10.6029f, 16.4595f)
                curveTo(8.9303f, 15.7299f, 7.5952f, 14.364f, 6.6827f, 12.7959f)
                curveTo(6.2987f, 12.136f, 5.9842f, 11.4313f, 5.7487f, 10.7093f)
                close()
                moveTo(12.0f, 2.75f)
                curveTo(9.0638f, 2.75f, 6.75f, 5.0021f, 6.75f, 7.7003f)
                curveTo(6.75f, 9.1178f, 7.1874f, 10.6808f, 7.9792f, 12.0415f)
                curveTo(8.7712f, 13.4026f, 9.8875f, 14.5109f, 11.2027f, 15.0847f)
                curveTo(11.708f, 15.3051f, 12.292f, 15.3051f, 12.7973f, 15.0847f)
                curveTo(14.1125f, 14.5109f, 15.2288f, 13.4026f, 16.0208f, 12.0415f)
                curveTo(16.8126f, 10.6808f, 17.25f, 9.1178f, 17.25f, 7.7003f)
                curveTo(17.25f, 5.0021f, 14.9362f, 2.75f, 12.0f, 2.75f)
                close()
                moveTo(12.0f, 6.75f)
                curveTo(11.3096f, 6.75f, 10.75f, 7.3096f, 10.75f, 8.0f)
                curveTo(10.75f, 8.6904f, 11.3096f, 9.25f, 12.0f, 9.25f)
                curveTo(12.6904f, 9.25f, 13.25f, 8.6904f, 13.25f, 8.0f)
                curveTo(13.25f, 7.3096f, 12.6904f, 6.75f, 12.0f, 6.75f)
                close()
                moveTo(9.25f, 8.0f)
                curveTo(9.25f, 6.4812f, 10.4812f, 5.25f, 12.0f, 5.25f)
                curveTo(13.5188f, 5.25f, 14.75f, 6.4812f, 14.75f, 8.0f)
                curveTo(14.75f, 9.5188f, 13.5188f, 10.75f, 12.0f, 10.75f)
                curveTo(10.4812f, 10.75f, 9.25f, 9.5188f, 9.25f, 8.0f)
                close()
            }
        }
            .build()
        return _pointOnMap!!
    }

private var _pointOnMap: ImageVector? = null
