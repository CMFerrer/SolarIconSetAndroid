package com.chiksmedina.solar.bold.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
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

public val SchoolGroup.NotebookBookmark: ImageVector
    get() {
        if (_notebookBookmark != null) {
            return _notebookBookmark!!
        }
        _notebookBookmark = Builder(name = "NotebookBookmark", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(14.2502f, 4.4795f)
                lineTo(14.2502f, 7.5372f)
                curveTo(14.25f, 7.6484f, 14.2498f, 7.807f, 14.271f, 7.9431f)
                curveTo(14.297f, 8.1095f, 14.3826f, 8.4308f, 14.7153f, 8.6261f)
                curveTo(15.0357f, 8.8142f, 15.349f, 8.7444f, 15.498f, 8.6981f)
                curveTo(15.6278f, 8.6577f, 15.7702f, 8.5899f, 15.8764f, 8.5393f)
                lineTo(17.0002f, 8.0055f)
                lineTo(18.124f, 8.5393f)
                curveTo(18.2302f, 8.5899f, 18.3725f, 8.6577f, 18.5024f, 8.6981f)
                curveTo(18.6513f, 8.7444f, 18.9647f, 8.8142f, 19.2851f, 8.6261f)
                curveTo(19.6177f, 8.4308f, 19.7033f, 8.1095f, 19.7293f, 7.9431f)
                curveTo(19.7506f, 7.807f, 19.7504f, 7.6484f, 19.7502f, 7.5372f)
                lineTo(19.7502f, 3.0313f)
                curveTo(19.863f, 3.026f, 19.9737f, 3.0215f, 20.082f, 3.0178f)
                curveTo(21.1538f, 2.9804f, 22.0f, 3.8607f, 22.0f, 4.9332f)
                verticalLineTo(16.1436f)
                curveTo(22.0f, 17.2546f, 21.094f, 18.1535f, 19.9851f, 18.2228f)
                curveTo(19.0157f, 18.2835f, 17.8767f, 18.402f, 17.0f, 18.6334f)
                curveTo(15.9185f, 18.9187f, 14.6271f, 19.5365f, 13.6276f, 20.0692f)
                curveTo(13.3485f, 20.218f, 13.0531f, 20.3257f, 12.7502f, 20.3925f)
                verticalLineTo(5.1739f)
                curveTo(13.0709f, 5.0953f, 13.3824f, 4.9714f, 13.6738f, 4.8028f)
                curveTo(13.8581f, 4.6961f, 14.0514f, 4.5873f, 14.2502f, 4.4795f)
                close()
                moveTo(19.7278f, 12.8181f)
                curveTo(19.8282f, 13.2199f, 19.5839f, 13.6271f, 19.1821f, 13.7276f)
                lineTo(15.1821f, 14.7276f)
                curveTo(14.7802f, 14.8281f, 14.373f, 14.5837f, 14.2726f, 14.1819f)
                curveTo(14.1721f, 13.7801f, 14.4164f, 13.3729f, 14.8183f, 13.2724f)
                lineTo(18.8183f, 12.2724f)
                curveTo(19.2201f, 12.1719f, 19.6273f, 12.4163f, 19.7278f, 12.8181f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(11.2502f, 5.214f)
                curveTo(10.9159f, 5.1505f, 10.5894f, 5.0378f, 10.2823f, 4.8755f)
                curveTo(9.2961f, 4.354f, 8.0492f, 3.7643f, 7.0f, 3.4874f)
                curveTo(6.1135f, 3.2535f, 4.9588f, 3.1349f, 3.9824f, 3.0749f)
                curveTo(2.8863f, 3.0075f, 2.0f, 3.8996f, 2.0f, 4.9978f)
                verticalLineTo(16.1436f)
                curveTo(2.0f, 17.2546f, 2.906f, 18.1535f, 4.0149f, 18.2228f)
                curveTo(4.9843f, 18.2835f, 6.1233f, 18.402f, 7.0f, 18.6334f)
                curveTo(8.0815f, 18.9187f, 9.3729f, 19.5365f, 10.3724f, 20.0692f)
                curveTo(10.6516f, 20.218f, 10.9472f, 20.3258f, 11.2502f, 20.3926f)
                verticalLineTo(5.214f)
                close()
                moveTo(4.2726f, 8.8181f)
                curveTo(4.373f, 8.4163f, 4.7802f, 8.1719f, 5.1821f, 8.2724f)
                lineTo(9.1821f, 9.2724f)
                curveTo(9.5839f, 9.3729f, 9.8282f, 9.7801f, 9.7278f, 10.1819f)
                curveTo(9.6273f, 10.5837f, 9.2201f, 10.8281f, 8.8183f, 10.7276f)
                lineTo(4.8183f, 9.7276f)
                curveTo(4.4164f, 9.6271f, 4.1721f, 9.2199f, 4.2726f, 8.8181f)
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
                    pathFillType = NonZero) {
                moveTo(18.2502f, 3.151f)
                curveTo(17.6301f, 3.2243f, 17.0206f, 3.3316f, 16.5f, 3.4874f)
                curveTo(16.2585f, 3.5598f, 16.0064f, 3.6514f, 15.7502f, 3.7564f)
                verticalLineTo(3.95f)
                verticalLineTo(6.9386f)
                lineTo(16.4995f, 6.5827f)
                lineTo(16.5083f, 6.5782f)
                curveTo(16.5573f, 6.5532f, 16.7638f, 6.4476f, 17.0002f, 6.4476f)
                curveTo(17.0477f, 6.4476f, 17.094f, 6.4518f, 17.1381f, 6.4589f)
                curveTo(17.3132f, 6.4868f, 17.4529f, 6.5582f, 17.4921f, 6.5782f)
                lineTo(17.5009f, 6.5827f)
                lineTo(18.2502f, 6.9386f)
                verticalLineTo(3.6467f)
                verticalLineTo(3.151f)
                close()
            }
        }
        .build()
        return _notebookBookmark!!
    }

private var _notebookBookmark: ImageVector? = null
