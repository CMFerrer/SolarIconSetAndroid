package dev.chiksmedina.solar.bold.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.MedicineGroup

val MedicineGroup.TestTube: ImageVector
    get() {
        if (_testTube != null) {
            return _testTube!!
        }
        _testTube = Builder(
            name = "TestTube", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.267f, 1.6185f)
                curveTo(8.4778f, 1.2619f, 8.9377f, 1.1437f, 9.2943f, 1.3545f)
                lineTo(10.126f, 1.8462f)
                lineTo(19.3731f, 7.1534f)
                curveTo(19.7324f, 7.3596f, 19.8564f, 7.8179f, 19.6503f, 8.1772f)
                curveTo(19.4441f, 8.5364f, 18.9857f, 8.6605f, 18.6264f, 8.4543f)
                lineTo(17.7828f, 7.9701f)
                lineTo(16.278f, 10.5675f)
                lineTo(16.2762f, 10.5665f)
                lineTo(13.7181f, 9.0947f)
                curveTo(13.3591f, 8.8881f, 12.9006f, 9.0117f, 12.694f, 9.3707f)
                curveTo(12.4875f, 9.7297f, 12.611f, 10.1883f, 12.9701f, 10.3948f)
                lineTo(15.526f, 11.8654f)
                lineTo(14.5646f, 13.525f)
                lineTo(14.5628f, 13.5239f)
                lineTo(10.3598f, 11.1057f)
                curveTo(10.0008f, 10.8991f, 9.5423f, 11.0227f, 9.3357f, 11.3818f)
                curveTo(9.1291f, 11.7408f, 9.2527f, 12.1993f, 9.6117f, 12.4059f)
                lineTo(13.8126f, 14.8229f)
                lineTo(12.927f, 16.3515f)
                lineTo(12.9252f, 16.3505f)
                lineTo(10.3125f, 14.8472f)
                curveTo(9.9535f, 14.6407f, 9.495f, 14.7643f, 9.2884f, 15.1233f)
                curveTo(9.0818f, 15.4823f, 9.2054f, 15.9408f, 9.5645f, 16.1474f)
                lineTo(12.1751f, 17.6494f)
                lineTo(11.0558f, 19.5814f)
                curveTo(9.7158f, 21.8943f, 6.748f, 22.6868f, 4.4271f, 21.3514f)
                curveTo(2.1061f, 20.0161f, 1.3109f, 17.0585f, 2.6509f, 14.7456f)
                lineTo(9.3727f, 3.1433f)
                lineTo(9.3668f, 3.1399f)
                lineTo(8.5309f, 2.6457f)
                curveTo(8.1744f, 2.435f, 8.0562f, 1.975f, 8.267f, 1.6185f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(20.0f, 16.9999f)
                curveTo(21.1046f, 16.9999f, 22.0f, 16.0672f, 22.0f, 14.9166f)
                curveTo(22.0f, 14.1967f, 21.217f, 13.2358f, 20.6309f, 12.6174f)
                curveTo(20.2839f, 12.2512f, 19.7161f, 12.2512f, 19.3691f, 12.6174f)
                curveTo(18.783f, 13.2358f, 18.0f, 14.1967f, 18.0f, 14.9166f)
                curveTo(18.0f, 16.0672f, 18.8954f, 16.9999f, 20.0f, 16.9999f)
                close()
            }
        }
            .build()
        return _testTube!!
    }

private var _testTube: ImageVector? = null
