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

val FoldersGroup.FolderPathConnect: ImageVector
    get() {
        if (_folderPathConnect != null) {
            return _folderPathConnect!!
        }
        _folderPathConnect = Builder(
            name = "FolderPathConnect", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(16.5f, 7.5f)
                lineTo(13.5f, 7.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 5.2173f)
                curveTo(5.0f, 4.6437f, 5.0f, 4.3569f, 5.0486f, 4.1179f)
                curveTo(5.2622f, 3.0662f, 6.1482f, 2.2435f, 7.2809f, 2.0451f)
                curveTo(7.5382f, 2.0f, 7.8471f, 2.0f, 8.4648f, 2.0f)
                curveTo(8.7355f, 2.0f, 8.8708f, 2.0f, 9.0009f, 2.0113f)
                curveTo(9.5617f, 2.06f, 10.0936f, 2.2646f, 10.5272f, 2.5983f)
                curveTo(10.6277f, 2.6758f, 10.7234f, 2.7646f, 10.9148f, 2.9423f)
                lineTo(11.3f, 3.3f)
                curveTo(11.871f, 3.8303f, 12.1566f, 4.0954f, 12.4985f, 4.272f)
                curveTo(12.6863f, 4.3691f, 12.8855f, 4.4457f, 13.0922f, 4.5004f)
                curveTo(13.4685f, 4.6f, 13.8723f, 4.6f, 14.6799f, 4.6f)
                horizontalLineTo(14.9415f)
                curveTo(16.7841f, 4.6f, 17.7055f, 4.6f, 18.3043f, 5.1002f)
                curveTo(18.3594f, 5.1462f, 18.4118f, 5.1948f, 18.4614f, 5.246f)
                curveTo(19.0f, 5.8021f, 19.0f, 6.6576f, 19.0f, 8.3686f)
                verticalLineTo(9.8f)
                curveTo(19.0f, 12.2513f, 19.0f, 13.477f, 18.1799f, 14.2385f)
                curveTo(17.3598f, 15.0f, 16.0399f, 15.0f, 13.4f, 15.0f)
                horizontalLineTo(10.6f)
                curveTo(7.9601f, 15.0f, 6.6402f, 15.0f, 5.8201f, 14.2385f)
                curveTo(5.0f, 13.477f, 5.0f, 12.2513f, 5.0f, 9.8f)
                verticalLineTo(5.2173f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 20.0f)
                horizontalLineTo(14.0f)
                moveTo(2.0f, 20.0f)
                horizontalLineTo(10.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 18.0f)
                verticalLineTo(15.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(12.0f, 20.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
        }
            .build()
        return _folderPathConnect!!
    }

private var _folderPathConnect: ImageVector? = null
