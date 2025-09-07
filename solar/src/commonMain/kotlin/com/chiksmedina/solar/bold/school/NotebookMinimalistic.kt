package com.chiksmedina.solar.bold.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SchoolGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 16.1436f)
                verticalLineTo(4.9978f)
                curveTo(2.0f, 3.8996f, 2.8863f, 3.0075f, 3.9824f, 3.0749f)
                curveTo(4.9588f, 3.1349f, 6.1135f, 3.2535f, 7.0f, 3.4874f)
                curveTo(8.0492f, 3.7643f, 9.2961f, 4.354f, 10.2823f, 4.8755f)
                curveTo(10.5893f, 5.0378f, 10.9158f, 5.1504f, 11.25f, 5.2139f)
                lineTo(11.25f, 20.3926f)
                curveTo(10.9471f, 20.3258f, 10.6515f, 20.218f, 10.3724f, 20.0692f)
                curveTo(9.3729f, 19.5365f, 8.0815f, 18.9187f, 7.0f, 18.6334f)
                curveTo(6.1233f, 18.402f, 4.9843f, 18.2835f, 4.0149f, 18.2228f)
                curveTo(2.906f, 18.1535f, 2.0f, 17.2546f, 2.0f, 16.1436f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.75f, 20.3926f)
                curveTo(13.0529f, 20.3258f, 13.3485f, 20.218f, 13.6276f, 20.0692f)
                curveTo(14.6271f, 19.5365f, 15.9185f, 18.9187f, 17.0f, 18.6334f)
                curveTo(17.8767f, 18.402f, 19.0157f, 18.2835f, 19.9851f, 18.2228f)
                curveTo(21.094f, 18.1535f, 22.0f, 17.2546f, 22.0f, 16.1436f)
                verticalLineTo(4.9332f)
                curveTo(22.0f, 3.8607f, 21.1538f, 2.9804f, 20.082f, 3.0178f)
                curveTo(18.9534f, 3.0571f, 17.5469f, 3.174f, 16.5f, 3.4874f)
                curveTo(15.5924f, 3.7592f, 14.5353f, 4.3042f, 13.6738f, 4.8028f)
                curveTo(13.3824f, 4.9714f, 13.0708f, 5.0953f, 12.75f, 5.1739f)
                lineTo(12.75f, 20.3926f)
                close()
            }
        }
            .build()
        return _notebookMinimalistic!!
    }

private var _notebookMinimalistic: ImageVector? = null
