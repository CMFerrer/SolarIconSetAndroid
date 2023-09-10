package com.chiksmedina.solar.boldduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.SchoolGroup

val SchoolGroup.Notebook: ImageVector
    get() {
        if (_notebook != null) {
            return _notebook!!
        }
        _notebook = Builder(
            name = "Notebook", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 5.214f)
                curveTo(11.3163f, 5.214f, 10.9426f, 5.0526f, 10.2823f, 4.8754f)
                curveTo(8.9381f, 4.5148f, 8.0492f, 3.7643f, 7.0f, 3.4874f)
                curveTo(6.1135f, 3.2535f, 4.9588f, 3.1349f, 3.9824f, 3.0749f)
                curveTo(2.8863f, 3.0075f, 2.0f, 3.8996f, 2.0f, 4.9978f)
                verticalLineTo(16.1436f)
                curveTo(2.0f, 17.2545f, 2.906f, 18.1534f, 4.0149f, 18.2228f)
                curveTo(4.9843f, 18.2834f, 6.1233f, 18.402f, 7.0f, 18.6333f)
                curveTo(7.486f, 18.7616f, 8.2162f, 19.0645f, 8.8729f, 19.3592f)
                curveTo(9.8775f, 19.81f, 10.7139f, 20.3926f, 12.0f, 20.3926f)
                curveTo(13.2861f, 20.3926f, 14.1225f, 19.81f, 15.127f, 19.3592f)
                curveTo(15.7838f, 19.0645f, 16.514f, 18.7616f, 17.0f, 18.6333f)
                curveTo(17.8767f, 18.402f, 19.0157f, 18.2834f, 19.9851f, 18.2228f)
                curveTo(21.094f, 18.1534f, 22.0f, 17.2545f, 22.0f, 16.1436f)
                verticalLineTo(4.9978f)
                curveTo(22.0f, 3.8996f, 21.1137f, 3.0075f, 20.0176f, 3.0749f)
                curveTo(19.0412f, 3.1349f, 17.8865f, 3.2535f, 17.0f, 3.4874f)
                curveTo(15.9508f, 3.7643f, 15.0619f, 4.5148f, 13.7177f, 4.8754f)
                curveTo(13.0574f, 5.0526f, 12.6837f, 5.214f, 12.0f, 5.214f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(4.2726f, 12.8183f)
                curveTo(4.373f, 12.4164f, 4.7802f, 12.1721f, 5.1821f, 12.2726f)
                lineTo(9.1821f, 13.2726f)
                curveTo(9.5839f, 13.373f, 9.8282f, 13.7802f, 9.7278f, 14.1821f)
                curveTo(9.6273f, 14.5839f, 9.2201f, 14.8282f, 8.8183f, 14.7278f)
                lineTo(4.8183f, 13.7278f)
                curveTo(4.4164f, 13.6273f, 4.1721f, 13.2201f, 4.2726f, 12.8183f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(5.1821f, 8.2726f)
                curveTo(4.7802f, 8.1721f, 4.373f, 8.4164f, 4.2726f, 8.8183f)
                curveTo(4.1721f, 9.2201f, 4.4164f, 9.6273f, 4.8183f, 9.7278f)
                lineTo(8.8183f, 10.7278f)
                curveTo(9.2201f, 10.8282f, 9.6273f, 10.5839f, 9.7278f, 10.1821f)
                curveTo(9.8282f, 9.7802f, 9.5839f, 9.373f, 9.1821f, 9.2726f)
                lineTo(5.1821f, 8.2726f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(19.7274f, 12.8183f)
                curveTo(19.627f, 12.4164f, 19.2198f, 12.1721f, 18.8179f, 12.2726f)
                lineTo(14.8179f, 13.2726f)
                curveTo(14.4161f, 13.373f, 14.1718f, 13.7802f, 14.2722f, 14.1821f)
                curveTo(14.3727f, 14.5839f, 14.7799f, 14.8282f, 15.1817f, 14.7278f)
                lineTo(19.1817f, 13.7278f)
                curveTo(19.5836f, 13.6273f, 19.8279f, 13.2201f, 19.7274f, 12.8183f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.8179f, 8.2726f)
                curveTo(19.2198f, 8.1721f, 19.627f, 8.4164f, 19.7274f, 8.8183f)
                curveTo(19.8279f, 9.2201f, 19.5836f, 9.6273f, 19.1817f, 9.7278f)
                lineTo(15.1817f, 10.7278f)
                curveTo(14.7799f, 10.8282f, 14.3727f, 10.5839f, 14.2722f, 10.1821f)
                curveTo(14.1718f, 9.7802f, 14.4161f, 9.373f, 14.8179f, 9.2726f)
                lineTo(18.8179f, 8.2726f)
                close()
            }
        }
            .build()
        return _notebook!!
    }

private var _notebook: ImageVector? = null
