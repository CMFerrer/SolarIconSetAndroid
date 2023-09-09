package com.chiksmedina.solar.bold.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.bold.SchoolGroup

public val SchoolGroup.Notebook: ImageVector
    get() {
        if (_notebook != null) {
            return _notebook!!
        }
        _notebook = Builder(name = "Notebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(2.0f, 16.1436f)
                verticalLineTo(4.9978f)
                curveTo(2.0f, 3.8996f, 2.8863f, 3.0075f, 3.9824f, 3.0749f)
                curveTo(4.9588f, 3.1349f, 6.1135f, 3.2535f, 7.0f, 3.4874f)
                curveTo(8.0492f, 3.7643f, 9.2961f, 4.354f, 10.2823f, 4.8755f)
                curveTo(10.5894f, 5.0378f, 10.9159f, 5.1505f, 11.2502f, 5.214f)
                verticalLineTo(20.3926f)
                curveTo(10.9472f, 20.3258f, 10.6516f, 20.218f, 10.3724f, 20.0692f)
                curveTo(9.3729f, 19.5365f, 8.0815f, 18.9187f, 7.0f, 18.6334f)
                curveTo(6.1233f, 18.402f, 4.9843f, 18.2835f, 4.0149f, 18.2228f)
                curveTo(2.906f, 18.1535f, 2.0f, 17.2546f, 2.0f, 16.1436f)
                close()
                moveTo(5.1821f, 8.2724f)
                curveTo(4.7802f, 8.1719f, 4.373f, 8.4163f, 4.2726f, 8.8181f)
                curveTo(4.1721f, 9.2199f, 4.4164f, 9.6271f, 4.8183f, 9.7276f)
                lineTo(8.8183f, 10.7276f)
                curveTo(9.2201f, 10.8281f, 9.6273f, 10.5837f, 9.7278f, 10.1819f)
                curveTo(9.8282f, 9.7801f, 9.5839f, 9.3729f, 9.1821f, 9.2724f)
                lineTo(5.1821f, 8.2724f)
                close()
                moveTo(5.1821f, 12.2724f)
                curveTo(4.7802f, 12.1719f, 4.373f, 12.4163f, 4.2726f, 12.8181f)
                curveTo(4.1721f, 13.2199f, 4.4164f, 13.6271f, 4.8183f, 13.7276f)
                lineTo(8.8183f, 14.7276f)
                curveTo(9.2201f, 14.8281f, 9.6273f, 14.5837f, 9.7278f, 14.1819f)
                curveTo(9.8282f, 13.7801f, 9.5839f, 13.3729f, 9.1821f, 13.2724f)
                lineTo(5.1821f, 12.2724f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(12.7502f, 20.3925f)
                curveTo(13.0531f, 20.3257f, 13.3485f, 20.218f, 13.6276f, 20.0692f)
                curveTo(14.6271f, 19.5365f, 15.9185f, 18.9187f, 17.0f, 18.6334f)
                curveTo(17.8767f, 18.402f, 19.0157f, 18.2835f, 19.9851f, 18.2228f)
                curveTo(21.094f, 18.1535f, 22.0f, 17.2546f, 22.0f, 16.1436f)
                verticalLineTo(4.9332f)
                curveTo(22.0f, 3.8607f, 21.1538f, 2.9804f, 20.082f, 3.0178f)
                curveTo(18.9534f, 3.0571f, 17.5469f, 3.174f, 16.5f, 3.4874f)
                curveTo(15.5924f, 3.7592f, 14.5353f, 4.3042f, 13.6738f, 4.8028f)
                curveTo(13.3824f, 4.9714f, 13.0709f, 5.0953f, 12.7502f, 5.1739f)
                verticalLineTo(20.3925f)
                close()
                moveTo(19.1821f, 9.7276f)
                curveTo(19.5839f, 9.6271f, 19.8282f, 9.2199f, 19.7278f, 8.8181f)
                curveTo(19.6273f, 8.4163f, 19.2201f, 8.1719f, 18.8183f, 8.2724f)
                lineTo(14.8183f, 9.2724f)
                curveTo(14.4164f, 9.3729f, 14.1721f, 9.7801f, 14.2726f, 10.1819f)
                curveTo(14.373f, 10.5837f, 14.7802f, 10.8281f, 15.1821f, 10.7276f)
                lineTo(19.1821f, 9.7276f)
                close()
                moveTo(19.1821f, 13.7276f)
                curveTo(19.5839f, 13.6271f, 19.8282f, 13.2199f, 19.7278f, 12.8181f)
                curveTo(19.6273f, 12.4163f, 19.2201f, 12.1719f, 18.8183f, 12.2724f)
                lineTo(14.8183f, 13.2724f)
                curveTo(14.4164f, 13.3729f, 14.1721f, 13.7801f, 14.2726f, 14.1819f)
                curveTo(14.373f, 14.5837f, 14.7802f, 14.8281f, 15.1821f, 14.7276f)
                lineTo(19.1821f, 13.7276f)
                close()
            }
        }
        .build()
        return _notebook!!
    }

private var _notebook: ImageVector? = null
