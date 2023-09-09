package com.chiksmedina.solar.boldduotone.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.FoldersGroup

public val FoldersGroup.`FolderFavourite(bookmark)`: ImageVector
    get() {
        if (`_folderFavourite(bookmark)` != null) {
            return `_folderFavourite(bookmark)`!!
        }
        `_folderFavourite(bookmark)` = Builder(name = "FolderFavourite(bookmark)", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(18.0f, 10.8528f)
                verticalLineTo(6.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(10.8528f)
                curveTo(14.0f, 11.1429f, 14.0f, 11.2879f, 14.0949f, 11.3465f)
                curveTo(14.1897f, 11.4051f, 14.3194f, 11.3403f, 14.5789f, 11.2106f)
                lineTo(15.8211f, 10.5894f)
                curveTo(15.9089f, 10.5456f, 15.9528f, 10.5236f, 16.0f, 10.5236f)
                curveTo(16.0472f, 10.5236f, 16.0911f, 10.5456f, 16.1789f, 10.5894f)
                lineTo(17.4211f, 11.2106f)
                curveTo(17.6806f, 11.3403f, 17.8103f, 11.4051f, 17.9051f, 11.3465f)
                curveTo(18.0f, 11.2879f, 18.0f, 11.1429f, 18.0f, 10.8528f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
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
        }
        .build()
        return `_folderFavourite(bookmark)`!!
    }

private var `_folderFavourite(bookmark)`: ImageVector? = null
