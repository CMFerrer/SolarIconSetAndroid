package dev.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MedicineGroup

val MedicineGroup.Dna: ImageVector
    get() {
        if (_dna != null) {
            return _dna!!
        }
        _dna = Builder(
            name = "Dna", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth
            = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(15.0303f, 1.4697f)
                curveTo(15.3232f, 1.7626f, 15.3232f, 2.2374f, 15.0303f, 2.5303f)
                curveTo(14.6145f, 2.9461f, 14.2408f, 3.3883f, 13.9105f, 3.8498f)
                lineTo(15.1172f, 5.0566f)
                curveTo(15.4101f, 5.3495f, 15.4101f, 5.8243f, 15.1172f, 6.1172f)
                curveTo(14.8244f, 6.4101f, 14.3495f, 6.4101f, 14.0566f, 6.1172f)
                lineTo(13.1088f, 5.1694f)
                curveTo(12.8987f, 5.5834f, 12.7203f, 6.0065f, 12.5743f, 6.4346f)
                lineTo(17.4526f, 11.3128f)
                curveTo(17.4894f, 11.3496f, 17.5216f, 11.3893f, 17.5491f, 11.4312f)
                curveTo(17.957f, 11.293f, 18.3604f, 11.1253f, 18.7558f, 10.9288f)
                lineTo(15.748f, 7.921f)
                curveTo(15.4551f, 7.6281f, 15.4551f, 7.1532f, 15.748f, 6.8603f)
                curveTo(16.0409f, 6.5674f, 16.5158f, 6.5674f, 16.8087f, 6.8603f)
                lineTo(20.0845f, 10.1362f)
                curveTo(20.5698f, 9.7945f, 21.0342f, 9.4052f, 21.4697f, 8.9697f)
                curveTo(21.7626f, 8.6768f, 22.2374f, 8.6768f, 22.5303f, 8.9697f)
                curveTo(22.8232f, 9.2626f, 22.8232f, 9.7374f, 22.5303f, 10.0303f)
                curveTo(19.9077f, 12.653f, 16.2665f, 13.8839f, 12.9736f, 13.2434f)
                curveTo(13.7235f, 16.418f, 12.5739f, 19.9867f, 10.0303f, 22.5303f)
                curveTo(9.7374f, 22.8232f, 9.2626f, 22.8232f, 8.9697f, 22.5303f)
                curveTo(8.6768f, 22.2374f, 8.6768f, 21.7626f, 8.9697f, 21.4697f)
                curveTo(9.4064f, 21.0329f, 9.7931f, 20.565f, 10.1279f, 20.0753f)
                lineTo(8.7744f, 18.7217f)
                curveTo(8.4815f, 18.4288f, 8.4815f, 17.954f, 8.7744f, 17.6611f)
                curveTo(9.0673f, 17.3682f, 9.5421f, 17.3682f, 9.835f, 17.6611f)
                lineTo(10.8975f, 18.7235f)
                curveTo(11.084f, 18.3209f, 11.2387f, 17.9103f, 11.3608f, 17.4961f)
                curveTo(11.3443f, 17.4823f, 11.3283f, 17.4676f, 11.3128f, 17.4521f)
                lineTo(6.5008f, 12.6401f)
                curveTo(6.0611f, 12.7699f, 5.6255f, 12.9364f, 5.1992f, 13.1388f)
                lineTo(8.0303f, 15.9699f)
                curveTo(8.3232f, 16.2628f, 8.3232f, 16.7377f, 8.0303f, 17.0306f)
                curveTo(7.7374f, 17.3235f, 7.2626f, 17.3235f, 6.9697f, 17.0306f)
                lineTo(3.8575f, 13.9184f)
                curveTo(3.3922f, 14.2425f, 2.9471f, 14.6136f, 2.5303f, 15.0303f)
                curveTo(2.2374f, 15.3232f, 1.7626f, 15.3232f, 1.4697f, 15.0303f)
                curveTo(1.1768f, 14.7374f, 1.1768f, 14.2626f, 1.4697f, 13.9697f)
                curveTo(4.0133f, 11.4261f, 7.582f, 10.2765f, 10.7566f, 11.0264f)
                curveTo(10.1161f, 7.7335f, 11.347f, 4.0923f, 13.9697f, 1.4697f)
                curveTo(14.2626f, 1.1768f, 14.7374f, 1.1768f, 15.0303f, 1.4697f)
                close()
                moveTo(15.8509f, 11.8325f)
                lineTo(12.1675f, 8.1491f)
                curveTo(12.0094f, 9.3184f, 12.0947f, 10.4832f, 12.439f, 11.561f)
                curveTo(13.5168f, 11.9053f, 14.6815f, 11.9906f, 15.8509f, 11.8325f)
                close()
                moveTo(11.3303f, 12.954f)
                curveTo(11.629f, 13.8215f, 11.7433f, 14.7542f, 11.6826f, 15.7006f)
                lineTo(8.2994f, 12.3174f)
                curveTo(9.2458f, 12.2567f, 10.1785f, 12.371f, 11.046f, 12.6697f)
                lineTo(11.2575f, 12.7425f)
                lineTo(11.3303f, 12.954f)
                close()
            }
        }
            .build()
        return _dna!!
    }

private var _dna: ImageVector? = null
