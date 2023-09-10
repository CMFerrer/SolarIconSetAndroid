package com.chiksmedina.solar.outline.medicine

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.MedicineGroup

val MedicineGroup.Pill: ImageVector
    get() {
        if (_pill != null) {
            return _pill!!
        }
        _pill = Builder(
            name = "Pill", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(14.1322f, 3.4602f)
                curveTo(11.1852f, 0.5133f, 6.4072f, 0.5133f, 3.4602f, 3.4602f)
                curveTo(0.5133f, 6.4072f, 0.5133f, 11.1852f, 3.4602f, 14.1322f)
                lineTo(9.8678f, 20.5398f)
                curveTo(12.8148f, 23.4867f, 17.5928f, 23.4867f, 20.5398f, 20.5398f)
                curveTo(23.4867f, 17.5928f, 23.4867f, 12.8148f, 20.5398f, 9.8678f)
                lineTo(14.1322f, 3.4602f)
                close()
                moveTo(4.5209f, 4.5209f)
                curveTo(6.8821f, 2.1597f, 10.7104f, 2.1597f, 13.0716f, 4.5209f)
                lineTo(15.9689f, 7.4183f)
                curveTo(15.9653f, 7.4297f, 15.9616f, 7.4415f, 15.9578f, 7.4535f)
                curveTo(15.8679f, 7.7347f, 15.7151f, 8.1505f, 15.468f, 8.6631f)
                curveTo(14.9744f, 9.6874f, 14.1032f, 11.101f, 12.6019f, 12.6023f)
                curveTo(11.1005f, 14.1037f, 9.6871f, 14.9747f, 8.6629f, 15.4683f)
                curveTo(8.1504f, 15.7153f, 7.7347f, 15.868f, 7.4535f, 15.9578f)
                curveTo(7.4415f, 15.9616f, 7.4298f, 15.9654f, 7.4183f, 15.9689f)
                lineTo(4.5209f, 13.0716f)
                curveTo(2.1597f, 10.7104f, 2.1597f, 6.8821f, 4.5209f, 4.5209f)
                close()
                moveTo(8.5897f, 17.1403f)
                lineTo(10.9284f, 19.4791f)
                curveTo(13.2896f, 21.8403f, 17.1179f, 21.8403f, 19.4791f, 19.4791f)
                curveTo(21.8403f, 17.1179f, 21.8403f, 13.2896f, 19.4791f, 10.9284f)
                lineTo(17.1402f, 8.5896f)
                curveTo(17.0521f, 8.8083f, 16.9461f, 9.0512f, 16.8193f, 9.3144f)
                curveTo(16.2594f, 10.4761f, 15.2939f, 12.0316f, 13.6625f, 13.663f)
                curveTo(12.0312f, 15.2943f, 10.4757f, 16.2598f, 9.3141f, 16.8195f)
                curveTo(9.0511f, 16.9463f, 8.8083f, 17.0522f, 8.5897f, 17.1403f)
                close()
            }
        }
            .build()
        return _pill!!
    }

private var _pill: ImageVector? = null
