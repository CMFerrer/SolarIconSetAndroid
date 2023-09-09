package com.chiksmedina.solar.outline.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.NotesGroup

public val NotesGroup.NotesMinimalistic: ImageVector
    get() {
        if (_notesMinimalistic != null) {
            return _notesMinimalistic!!
        }
        _notesMinimalistic = Builder(name = "NotesMinimalistic", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(16.3939f, 2.0212f)
                lineTo(16.4604f, 2.039f)
                curveTo(17.5598f, 2.3336f, 18.431f, 2.567f, 19.1162f, 2.8146f)
                curveTo(19.8172f, 3.0678f, 20.3888f, 3.3574f, 20.8597f, 3.7985f)
                curveTo(21.5453f, 4.4407f, 22.0252f, 5.2718f, 22.2385f, 6.1867f)
                curveTo(22.385f, 6.815f, 22.3501f, 7.4549f, 22.2189f, 8.1885f)
                curveTo(22.0906f, 8.9057f, 21.8572f, 9.777f, 21.5626f, 10.8764f)
                lineTo(21.0271f, 12.8747f)
                curveTo(20.7326f, 13.974f, 20.4991f, 14.8452f, 20.2516f, 15.5305f)
                curveTo(19.9984f, 16.2314f, 19.7087f, 16.803f, 19.2677f, 17.2739f)
                curveTo(18.6459f, 17.9377f, 17.8471f, 18.4087f, 16.9665f, 18.6316f)
                curveTo(16.7093f, 19.2213f, 16.3336f, 19.7554f, 15.8597f, 20.1993f)
                curveTo(15.3888f, 20.6403f, 14.8172f, 20.9299f, 14.1162f, 21.1832f)
                curveTo(13.431f, 21.4307f, 12.5598f, 21.6641f, 11.4605f, 21.9587f)
                lineTo(11.394f, 21.9765f)
                curveTo(10.2946f, 22.2711f, 9.4234f, 22.5045f, 8.7061f, 22.6328f)
                curveTo(7.9725f, 22.764f, 7.3327f, 22.7989f, 6.7043f, 22.6524f)
                curveTo(5.7894f, 22.4391f, 4.9583f, 21.9592f, 4.3161f, 21.2736f)
                curveTo(3.8751f, 20.8027f, 3.5854f, 20.2311f, 3.3322f, 19.5302f)
                curveTo(3.0847f, 18.8449f, 2.8512f, 17.9737f, 2.5567f, 16.8743f)
                lineTo(2.0212f, 14.876f)
                curveTo(1.7266f, 13.7766f, 1.4932f, 12.9054f, 1.3649f, 12.1882f)
                curveTo(1.2338f, 11.4546f, 1.1988f, 10.8147f, 1.3453f, 10.1864f)
                curveTo(1.5586f, 9.2715f, 2.0385f, 8.4404f, 2.7242f, 7.7982f)
                curveTo(3.1951f, 7.3571f, 3.7666f, 7.0675f, 4.4676f, 6.8143f)
                curveTo(5.1528f, 6.5667f, 6.024f, 6.3333f, 7.1234f, 6.0387f)
                lineTo(7.1567f, 6.0298f)
                curveTo(7.4211f, 5.959f, 7.6713f, 5.892f, 7.9082f, 5.8294f)
                curveTo(8.2999f, 4.4303f, 8.6445f, 3.4413f, 9.3161f, 2.7242f)
                curveTo(9.9583f, 2.0385f, 10.7894f, 1.5586f, 11.7043f, 1.3453f)
                curveTo(12.3327f, 1.1988f, 12.9725f, 1.2338f, 13.7061f, 1.3649f)
                curveTo(14.4233f, 1.4932f, 15.2945f, 1.7266f, 16.3939f, 2.0212f)
                close()
                moveTo(7.455f, 7.5028f)
                curveTo(6.3621f, 7.7957f, 5.5791f, 8.0076f, 4.9772f, 8.225f)
                curveTo(4.3678f, 8.4452f, 4.01f, 8.6491f, 3.7496f, 8.893f)
                curveTo(3.2804f, 9.3324f, 2.9521f, 9.901f, 2.8061f, 10.527f)
                curveTo(2.7251f, 10.8745f, 2.7275f, 11.2863f, 2.8415f, 11.9242f)
                curveTo(2.9572f, 12.5712f, 3.1735f, 13.381f, 3.479f, 14.521f)
                lineTo(3.9967f, 16.4529f)
                curveTo(4.3021f, 17.5929f, 4.5197f, 18.4023f, 4.743f, 19.0205f)
                curveTo(4.9631f, 19.63f, 5.167f, 19.9878f, 5.4109f, 20.2482f)
                curveTo(5.8503f, 20.7173f, 6.419f, 21.0456f, 7.045f, 21.1916f)
                curveTo(7.3924f, 21.2726f, 7.8042f, 21.2703f, 8.4421f, 21.1562f)
                curveTo(9.0892f, 21.0405f, 9.8989f, 20.8242f, 11.0389f, 20.5187f)
                curveTo(12.1789f, 20.2132f, 12.9884f, 19.9957f, 13.6066f, 19.7724f)
                curveTo(14.216f, 19.5522f, 14.5739f, 19.3484f, 14.8343f, 19.1045f)
                curveTo(14.9719f, 18.9756f, 15.0973f, 18.8357f, 15.2096f, 18.6865f)
                curveTo(15.0306f, 18.6612f, 14.8463f, 18.629f, 14.6557f, 18.5911f)
                curveTo(13.9839f, 18.4575f, 13.1769f, 18.2413f, 12.1808f, 17.9744f)
                lineTo(12.1234f, 17.959f)
                curveTo(11.024f, 17.6644f, 10.1528f, 17.431f, 9.4676f, 17.1835f)
                curveTo(8.7666f, 16.9302f, 8.1951f, 16.6406f, 7.7242f, 16.1996f)
                curveTo(7.0385f, 15.5574f, 6.5586f, 14.7262f, 6.3453f, 13.8113f)
                curveTo(6.1988f, 13.183f, 6.2338f, 12.5432f, 6.3649f, 11.8095f)
                curveTo(6.4932f, 11.0923f, 6.7266f, 10.2211f, 7.0212f, 9.1217f)
                lineTo(7.455f, 7.5028f)
                close()
                moveTo(13.4421f, 2.8415f)
                curveTo(12.8042f, 2.7275f, 12.3924f, 2.7251f, 12.045f, 2.8061f)
                curveTo(11.419f, 2.9521f, 10.8503f, 3.2804f, 10.4109f, 3.7496f)
                curveTo(9.9748f, 4.2152f, 9.7064f, 4.9345f, 9.2397f, 6.6432f)
                curveTo(9.1638f, 6.9209f, 9.0836f, 7.2202f, 8.9966f, 7.5449f)
                lineTo(8.479f, 9.4767f)
                curveTo(8.1735f, 10.6167f, 7.9572f, 11.4265f, 7.8415f, 12.0736f)
                curveTo(7.7275f, 12.7114f, 7.7251f, 13.1232f, 7.8061f, 13.4707f)
                curveTo(7.9521f, 14.0967f, 8.2804f, 14.6654f, 8.7495f, 15.1048f)
                curveTo(9.0099f, 15.3487f, 9.3678f, 15.5525f, 9.9772f, 15.7727f)
                curveTo(10.5954f, 15.996f, 11.4049f, 16.2136f, 12.5449f, 16.519f)
                curveTo(13.5703f, 16.7938f, 14.3303f, 16.997f, 14.9482f, 17.1199f)
                curveTo(15.5635f, 17.2422f, 15.981f, 17.2723f, 16.3232f, 17.23f)
                curveTo(16.3976f, 17.2209f, 16.4691f, 17.2082f, 16.5389f, 17.1919f)
                curveTo(17.1649f, 17.0459f, 17.7335f, 16.7176f, 18.1729f, 16.2485f)
                curveTo(18.4168f, 15.9881f, 18.6207f, 15.6303f, 18.8408f, 15.0208f)
                curveTo(19.0642f, 14.4026f, 19.2817f, 13.5932f, 19.5872f, 12.4532f)
                lineTo(20.1048f, 10.5213f)
                curveTo(20.4103f, 9.3813f, 20.6266f, 8.5715f, 20.7423f, 7.9245f)
                curveTo(20.8564f, 7.2866f, 20.8587f, 6.8748f, 20.7777f, 6.5273f)
                curveTo(20.6317f, 5.9013f, 20.3034f, 5.3327f, 19.8343f, 4.8933f)
                curveTo(19.5739f, 4.6494f, 19.216f, 4.4455f, 18.6066f, 4.2253f)
                curveTo(17.9884f, 4.002f, 17.1789f, 3.7845f, 16.0389f, 3.479f)
                curveTo(14.8989f, 3.1735f, 14.0892f, 2.9572f, 13.4421f, 2.8415f)
                close()
            }
        }
        .build()
        return _notesMinimalistic!!
    }

private var _notesMinimalistic: ImageVector? = null
