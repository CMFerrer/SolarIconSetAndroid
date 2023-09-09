package com.chiksmedina.solar.broken.businessstatistic

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.broken.BusinessStatisticGroup

public val BusinessStatisticGroup.PieChart: ImageVector
    get() {
        if (_pieChart != null) {
            return _pieChart!!
        }
        _pieChart = Builder(name = "PieChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(20.0f, 15.5524f)
                curveTo(18.8263f, 19.2893f, 15.3351f, 22.0f, 11.2108f, 22.0f)
                curveTo(6.1238f, 22.0f, 2.0f, 17.8762f, 2.0f, 12.7892f)
                curveTo(2.0f, 11.8169f, 2.1506f, 10.8798f, 2.4299f, 10.0f)
                moveTo(8.4476f, 4.0f)
                curveTo(7.1515f, 4.4071f, 5.9789f, 5.0929f, 5.0f, 5.9872f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(21.9131f, 9.9473f)
                curveTo(20.8515f, 6.1444f, 17.8556f, 3.1484f, 14.0527f, 2.0869f)
                curveTo(12.4091f, 1.6281f, 11.0f, 3.0542f, 11.0f, 4.7606f)
                verticalLineTo(11.4551f)
                curveTo(11.0f, 12.3083f, 11.6917f, 13.0f, 12.5449f, 13.0f)
                horizontalLineTo(19.2394f)
                curveTo(20.9458f, 13.0f, 22.3719f, 11.5909f, 21.9131f, 9.9473f)
                close()
            }
        }
        .build()
        return _pieChart!!
    }

private var _pieChart: ImageVector? = null
