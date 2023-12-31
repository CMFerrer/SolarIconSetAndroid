package com.chiksmedina.solar.lineduotone.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.MedicineGroup

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
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 9.8487f)
                lineTo(14.1815f, 3.0f)
                moveTo(14.8635f, 3.685f)
                lineTo(20.2387f, 9.084f)
                lineTo(13.0f, 16.3547f)
                lineTo(9.4884f, 19.8818f)
                curveTo(8.0041f, 21.3727f, 5.5975f, 21.3727f, 4.1132f, 19.8818f)
                curveTo(2.6289f, 18.391f, 2.6289f, 15.9738f, 4.1132f, 14.4829f)
                lineTo(14.8635f, 3.685f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(6.8008f, 11.7834f)
                lineTo(8.075f, 11.9257f)
                curveTo(9.0977f, 12.0398f, 9.905f, 12.8507f, 10.0187f, 13.8779f)
                curveTo(10.1062f, 14.6689f, 10.6104f, 15.3515f, 11.3386f, 15.665f)
                lineTo(13.0f, 16.3547f)
            }
        }
            .build()
        return _testTubeMinimalistic!!
    }

private var _testTubeMinimalistic: ImageVector? = null
