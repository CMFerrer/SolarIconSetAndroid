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

val MedicineGroup.TestTubeMinimalistic: ImageVector
    get() {
        if (_testTubeMinimalistic != null) {
            return _testTubeMinimalistic!!
        }
        _testTubeMinimalistic = Builder(
            name = "TestTubeMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.8692f, 2.2238f)
                curveTo(14.5731f, 1.9263f, 14.0919f, 1.9253f, 13.7944f, 2.2214f)
                curveTo(13.497f, 2.5176f, 13.4959f, 2.9988f, 13.7921f, 3.2962f)
                lineTo(14.4855f, 3.9927f)
                lineTo(7.5367f, 10.9723f)
                lineTo(8.2269f, 11.0493f)
                curveTo(9.6187f, 11.2047f, 10.7136f, 12.3074f, 10.8676f, 13.6994f)
                curveTo(10.9262f, 14.2289f, 11.2627f, 14.6842f, 11.7462f, 14.8941f)
                lineTo(13.7129f, 15.7105f)
                lineTo(19.9323f, 9.4636f)
                lineTo(20.7014f, 10.2362f)
                curveTo(20.9976f, 10.5336f, 21.4788f, 10.5347f, 21.7762f, 10.2386f)
                curveTo(22.0737f, 9.9424f, 22.0747f, 9.4612f, 21.7786f, 9.1638f)
                lineTo(14.8692f, 2.2238f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.1281f, 14.396f)
                lineTo(6.1663f, 12.3488f)
                lineTo(8.0583f, 12.56f)
                curveTo(8.7392f, 12.636f, 9.2805f, 13.1767f, 9.3568f, 13.8665f)
                curveTo(9.4754f, 14.9386f, 10.159f, 15.8658f, 11.1492f, 16.292f)
                lineTo(12.5536f, 16.875f)
                lineTo(9.5748f, 19.8669f)
                curveTo(8.0708f, 21.3777f, 5.6322f, 21.3777f, 4.1281f, 19.8669f)
                curveTo(2.624f, 18.3562f, 2.624f, 15.9068f, 4.1281f, 14.396f)
                close()
            }
        }
            .build()
        return _testTubeMinimalistic!!
    }

private var _testTubeMinimalistic: ImageVector? = null
