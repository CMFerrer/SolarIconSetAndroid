package com.chiksmedina.solar.boldduotone.school

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
import com.chiksmedina.solar.boldduotone.SchoolGroup

val SchoolGroup.NotebookMinimalistic: ImageVector
    get() {
        if (_notebookMinimalistic != null) {
            return _notebookMinimalistic!!
        }
        _notebookMinimalistic = Builder(
            name = "NotebookMinimalistic", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = EvenOdd
            ) {
                moveTo(2.0f, 16.1436f)
                verticalLineTo(4.9978f)
                curveTo(2.0f, 3.8996f, 2.8863f, 3.0075f, 3.9824f, 3.0749f)
                curveTo(4.9588f, 3.1349f, 6.1135f, 3.2535f, 7.0f, 3.4874f)
                curveTo(8.0492f, 3.7643f, 9.2961f, 4.354f, 10.2823f, 4.8754f)
                curveTo(10.8166f, 5.158f, 11.41f, 5.2899f, 12.0f, 5.2744f)
                verticalLineTo(20.4741f)
                curveTo(11.4394f, 20.4741f, 10.8788f, 20.3392f, 10.3724f, 20.0692f)
                curveTo(9.3729f, 19.5364f, 8.0815f, 18.9187f, 7.0f, 18.6333f)
                curveTo(6.1233f, 18.402f, 4.9843f, 18.2834f, 4.0149f, 18.2228f)
                curveTo(2.906f, 18.1534f, 2.0f, 17.2545f, 2.0f, 16.1436f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 16.1436f)
                verticalLineTo(4.9332f)
                curveTo(22.0f, 3.8607f, 21.1538f, 2.9804f, 20.082f, 3.0178f)
                curveTo(18.9534f, 3.0571f, 17.5469f, 3.174f, 16.5f, 3.4874f)
                curveTo(15.5924f, 3.7592f, 14.5353f, 4.3042f, 13.6738f, 4.8028f)
                curveTo(13.1587f, 5.1009f, 12.581f, 5.2591f, 12.0f, 5.2744f)
                verticalLineTo(20.4741f)
                curveTo(12.5606f, 20.4741f, 13.1212f, 20.3392f, 13.6276f, 20.0692f)
                curveTo(14.6271f, 19.5365f, 15.9185f, 18.9187f, 17.0f, 18.6334f)
                curveTo(17.8767f, 18.402f, 19.0157f, 18.2835f, 19.9851f, 18.2228f)
                curveTo(21.094f, 18.1535f, 22.0f, 17.2546f, 22.0f, 16.1436f)
                close()
            }
        }
            .build()
        return _notebookMinimalistic!!
    }

private var _notebookMinimalistic: ImageVector? = null
