package com.chiksmedina.solar.linear.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.linear.FoldersGroup

val FoldersGroup.FolderOpen: ImageVector
    get() {
        if (_folderOpen != null) {
            return _folderOpen!!
        }
        _folderOpen = Builder(
            name = "FolderOpen", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(4.0f, 11.5f)
                verticalLineTo(5.7123f)
                curveTo(4.0f, 5.0504f, 4.0f, 4.7195f, 4.0555f, 4.4438f)
                curveTo(4.2997f, 3.2302f, 5.3123f, 2.281f, 6.6067f, 2.052f)
                curveTo(6.9008f, 2.0f, 7.2538f, 2.0f, 7.9598f, 2.0f)
                curveTo(8.2691f, 2.0f, 8.4238f, 2.0f, 8.5725f, 2.013f)
                curveTo(9.2133f, 2.0692f, 9.8212f, 2.3053f, 10.3168f, 2.6904f)
                curveTo(10.4317f, 2.7797f, 10.5411f, 2.8822f, 10.7598f, 3.0873f)
                lineTo(11.2f, 3.5f)
                curveTo(11.8526f, 4.1118f, 12.1789f, 4.4177f, 12.5697f, 4.6216f)
                curveTo(12.7844f, 4.7335f, 13.012f, 4.8219f, 13.2483f, 4.8851f)
                curveTo(13.6783f, 5.0f, 14.1398f, 5.0f, 15.0627f, 5.0f)
                horizontalLineTo(15.3617f)
                curveTo(17.4676f, 5.0f, 18.5205f, 5.0f, 19.2049f, 5.5771f)
                curveTo(19.2679f, 5.6302f, 19.3278f, 5.6863f, 19.3844f, 5.7454f)
                curveTo(20.0f, 6.387f, 20.0f, 7.3741f, 20.0f, 9.3484f)
                verticalLineTo(11.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(10.0f, 17.0f)
                horizontalLineTo(14.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(3.4767f, 17.4839f)
                curveTo(2.9996f, 14.7678f, 2.761f, 13.4097f, 3.3391f, 12.433f)
                curveTo(3.4866f, 12.1838f, 3.6685f, 11.9582f, 3.8791f, 11.7634f)
                curveTo(4.7042f, 11.0f, 6.0379f, 11.0f, 8.7053f, 11.0f)
                horizontalLineTo(15.2947f)
                curveTo(17.9621f, 11.0f, 19.2958f, 11.0f, 20.1209f, 11.7634f)
                curveTo(20.3315f, 11.9582f, 20.5134f, 12.1838f, 20.6609f, 12.433f)
                curveTo(21.239f, 13.4097f, 21.0004f, 14.7678f, 20.5233f, 17.4839f)
                curveTo(20.1798f, 19.4391f, 20.008f, 20.4167f, 19.4129f, 21.0655f)
                curveTo(19.2585f, 21.2338f, 19.0858f, 21.383f, 18.8982f, 21.5101f)
                curveTo(18.175f, 22.0f, 17.2149f, 22.0f, 15.2947f, 22.0f)
                horizontalLineTo(8.7053f)
                curveTo(6.7851f, 22.0f, 5.825f, 22.0f, 5.1018f, 21.5101f)
                curveTo(4.9142f, 21.383f, 4.7414f, 21.2338f, 4.5871f, 21.0655f)
                curveTo(3.992f, 20.4167f, 3.8202f, 19.4391f, 3.4767f, 17.4839f)
                close()
            }
        }
            .build()
        return _folderOpen!!
    }

private var _folderOpen: ImageVector? = null
