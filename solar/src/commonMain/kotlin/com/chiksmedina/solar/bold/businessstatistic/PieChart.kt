package com.chiksmedina.solar.bold.businessstatistic

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
import com.chiksmedina.solar.bold.BusinessStatisticGroup

val BusinessStatisticGroup.PieChart: ImageVector
    get() {
        if (_pieChart != null) {
            return _pieChart!!
        }
        _pieChart = Builder(
            name = "PieChart", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.1631f, 3.7755f)
                curveTo(9.2872f, 4.1706f, 9.0675f, 4.5916f, 8.6723f, 4.7157f)
                curveTo(5.239f, 5.7941f, 2.75f, 9.002f, 2.75f, 12.7894f)
                curveTo(2.75f, 17.4622f, 6.5381f, 21.2502f, 11.2108f, 21.2502f)
                curveTo(14.9982f, 21.2502f, 18.2061f, 18.7612f, 19.2845f, 15.3279f)
                curveTo(19.4086f, 14.9327f, 19.8296f, 14.713f, 20.2247f, 14.8371f)
                curveTo(20.6199f, 14.9612f, 20.8397f, 15.3822f, 20.7155f, 15.7774f)
                curveTo(19.4465f, 19.8179f, 15.6721f, 22.7502f, 11.2108f, 22.7502f)
                curveTo(5.7096f, 22.7502f, 1.25f, 18.2906f, 1.25f, 12.7894f)
                curveTo(1.25f, 8.3281f, 4.1823f, 4.5537f, 8.2228f, 3.2847f)
                curveTo(8.618f, 3.1605f, 9.039f, 3.3803f, 9.1631f, 3.7755f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
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
