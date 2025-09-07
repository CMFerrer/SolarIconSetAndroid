package com.chiksmedina.solar.bold.folders

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
import com.chiksmedina.solar.bold.FoldersGroup

val FoldersGroup.FolderWithFiles: ImageVector
    get() {
        if (_folderWithFiles != null) {
            return _folderWithFiles!!
        }
        _folderWithFiles = Builder(
            name = "FolderWithFiles", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(2.0f, 6.9497f)
                curveTo(2.0f, 6.0672f, 2.0f, 5.6259f, 2.0694f, 5.2584f)
                curveTo(2.3746f, 3.6403f, 3.6403f, 2.3746f, 5.2584f, 2.0694f)
                curveTo(5.6259f, 2.0f, 6.0672f, 2.0f, 6.9497f, 2.0f)
                curveTo(7.3364f, 2.0f, 7.5298f, 2.0f, 7.7156f, 2.0174f)
                curveTo(8.5167f, 2.0923f, 9.2765f, 2.407f, 9.8959f, 2.9205f)
                curveTo(10.0396f, 3.0396f, 10.1763f, 3.1763f, 10.4497f, 3.4497f)
                lineTo(11.0f, 4.0f)
                curveTo(11.8158f, 4.8158f, 12.2237f, 5.2237f, 12.7121f, 5.4954f)
                curveTo(12.9804f, 5.6447f, 13.2651f, 5.7626f, 13.5604f, 5.8468f)
                curveTo(14.0979f, 6.0f, 14.6747f, 6.0f, 15.8284f, 6.0f)
                horizontalLineTo(16.2021f)
                curveTo(18.8345f, 6.0f, 20.1506f, 6.0f, 21.0062f, 6.7695f)
                curveTo(21.0849f, 6.8402f, 21.1598f, 6.9151f, 21.2305f, 6.9938f)
                curveTo(22.0f, 7.8493f, 22.0f, 9.1655f, 22.0f, 11.7979f)
                verticalLineTo(14.0f)
                curveTo(22.0f, 17.7712f, 22.0f, 19.6569f, 20.8284f, 20.8284f)
                curveTo(19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f, 22.0f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 22.0f, 4.3432f, 22.0f, 3.1716f, 20.8284f)
                curveTo(2.0f, 19.6569f, 2.0f, 17.7712f, 2.0f, 14.0f)
                verticalLineTo(6.9497f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFffffff)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(12.25f, 10.0f)
                curveTo(12.25f, 9.5858f, 12.5858f, 9.25f, 13.0f, 9.25f)
                horizontalLineTo(18.0f)
                curveTo(18.4142f, 9.25f, 18.75f, 9.5858f, 18.75f, 10.0f)
                curveTo(18.75f, 10.4142f, 18.4142f, 10.75f, 18.0f, 10.75f)
                horizontalLineTo(13.0f)
                curveTo(12.5858f, 10.75f, 12.25f, 10.4142f, 12.25f, 10.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(16.9856f, 3.0209f)
                curveTo(16.8321f, 3.0f, 16.6492f, 3.0f, 16.2835f, 3.0f)
                horizontalLineTo(12.0f)
                lineTo(12.3699f, 3.3831f)
                curveTo(13.0359f, 4.073f, 13.2919f, 4.3305f, 13.5877f, 4.501f)
                curveTo(13.7594f, 4.5999f, 13.9415f, 4.678f, 14.1304f, 4.7338f)
                curveTo(14.4559f, 4.8299f, 14.8128f, 4.8354f, 15.7546f, 4.8354f)
                lineTo(16.089f, 4.8354f)
                curveTo(17.0914f, 4.8354f, 17.8995f, 4.8354f, 18.5389f, 4.9186f)
                curveTo(18.6984f, 4.9394f, 18.8521f, 4.9658f, 19.0f, 5.0f)
                curveTo(18.8144f, 3.9631f, 18.0043f, 3.1598f, 16.9856f, 3.0209f)
                close()
            }
        }
            .build()
        return _folderWithFiles!!
    }

private var _folderWithFiles: ImageVector? = null
