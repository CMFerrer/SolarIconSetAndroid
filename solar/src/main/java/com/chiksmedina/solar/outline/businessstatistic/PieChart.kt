package com.chiksmedina.solar.outline.businessstatistic

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
import com.chiksmedina.solar.outline.BusinessStatisticGroup

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
                moveTo(14.2544f, 1.3643f)
                curveTo(13.1584f, 1.0583f, 12.132f, 1.3891f, 11.4026f, 2.0593f)
                curveTo(10.6845f, 2.7192f, 10.25f, 3.7053f, 10.25f, 4.7604f)
                verticalLineTo(11.4549f)
                curveTo(10.25f, 12.7223f, 11.2775f, 13.7498f, 12.5449f, 13.7498f)
                horizontalLineTo(19.2394f)
                curveTo(20.2945f, 13.7498f, 21.2806f, 13.3153f, 21.9405f, 12.5972f)
                curveTo(22.6107f, 11.8678f, 22.9414f, 10.8414f, 22.6355f, 9.7454f)
                curveTo(21.5034f, 5.6898f, 18.31f, 2.4964f, 14.2544f, 1.3643f)
                close()
                moveTo(11.75f, 4.7604f)
                curveTo(11.75f, 4.1091f, 12.0201f, 3.5289f, 12.4175f, 3.1638f)
                curveTo(12.8035f, 2.8091f, 13.3035f, 2.6562f, 13.8511f, 2.8091f)
                curveTo(17.4013f, 3.8001f, 20.1997f, 6.5985f, 21.1907f, 10.1487f)
                curveTo(21.3436f, 10.6963f, 21.1907f, 11.1963f, 20.8359f, 11.5823f)
                curveTo(20.4708f, 11.9797f, 19.8907f, 12.2498f, 19.2394f, 12.2498f)
                horizontalLineTo(12.5449f)
                curveTo(12.1059f, 12.2498f, 11.75f, 11.8939f, 11.75f, 11.4549f)
                verticalLineTo(4.7604f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(8.6723f, 4.7153f)
                curveTo(9.0675f, 4.5912f, 9.2872f, 4.1702f, 9.1631f, 3.775f)
                curveTo(9.039f, 3.3798f, 8.618f, 3.1601f, 8.2228f, 3.2842f)
                curveTo(4.1823f, 4.5533f, 1.25f, 8.3277f, 1.25f, 12.7889f)
                curveTo(1.25f, 18.2901f, 5.7096f, 22.7498f, 11.2108f, 22.7498f)
                curveTo(15.6721f, 22.7498f, 19.4465f, 19.8175f, 20.7155f, 15.7769f)
                curveTo(20.8397f, 15.3817f, 20.6199f, 14.9608f, 20.2247f, 14.8366f)
                curveTo(19.8296f, 14.7125f, 19.4086f, 14.9323f, 19.2845f, 15.3274f)
                curveTo(18.2061f, 18.7608f, 14.9982f, 21.2498f, 11.2108f, 21.2498f)
                curveTo(6.5381f, 21.2498f, 2.75f, 17.4617f, 2.75f, 12.7889f)
                curveTo(2.75f, 9.0016f, 5.239f, 5.7937f, 8.6723f, 4.7153f)
                close()
            }
        }
            .build()
        return _pieChart!!
    }

private var _pieChart: ImageVector? = null
