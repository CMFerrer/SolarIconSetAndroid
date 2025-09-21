package dev.chiksmedina.solar.boldduotone.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.boldduotone.FoldersGroup

val FoldersGroup.FolderFavouriteStar: ImageVector
    get() {
        if (_folderFavouriteStar != null) {
            return _folderFavouriteStar!!
        }
        _folderFavouriteStar = Builder(
            name = "FolderFavouriteStar", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(22.0f, 14.0f)
                verticalLineTo(11.7979f)
                curveTo(22.0f, 9.1655f, 22.0f, 7.8493f, 21.2305f, 6.9938f)
                curveTo(21.1598f, 6.9151f, 21.0849f, 6.8402f, 21.0062f, 6.7695f)
                curveTo(20.1506f, 6.0f, 18.8345f, 6.0f, 16.2021f, 6.0f)
                horizontalLineTo(15.8284f)
                curveTo(14.6747f, 6.0f, 14.0979f, 6.0f, 13.5604f, 5.8468f)
                curveTo(13.2651f, 5.7626f, 12.9804f, 5.6447f, 12.7121f, 5.4954f)
                curveTo(12.2237f, 5.2237f, 11.8158f, 4.8158f, 11.0f, 4.0f)
                lineTo(10.4497f, 3.4497f)
                curveTo(10.1763f, 3.1763f, 10.0396f, 3.0396f, 9.8959f, 2.9205f)
                curveTo(9.2765f, 2.407f, 8.5167f, 2.0923f, 7.7156f, 2.0174f)
                curveTo(7.5298f, 2.0f, 7.3364f, 2.0f, 6.9497f, 2.0f)
                curveTo(6.0672f, 2.0f, 5.6259f, 2.0f, 5.2584f, 2.0694f)
                curveTo(3.6403f, 2.3746f, 2.3746f, 3.6403f, 2.0694f, 5.2584f)
                curveTo(2.0f, 5.6259f, 2.0f, 6.0672f, 2.0f, 6.9497f)
                verticalLineTo(14.0f)
                curveTo(2.0f, 17.7712f, 2.0f, 19.6569f, 3.1716f, 20.8284f)
                curveTo(4.3432f, 22.0f, 6.2288f, 22.0f, 10.0f, 22.0f)
                horizontalLineTo(14.0f)
                curveTo(17.7712f, 22.0f, 19.6569f, 22.0f, 20.8284f, 20.8284f)
                curveTo(22.0f, 19.6569f, 22.0f, 17.7712f, 22.0f, 14.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.9524f, 11.1989f)
                lineTo(12.8541f, 11.0225f)
                curveTo(12.4741f, 10.3408f, 12.2841f, 10.0f, 12.0f, 10.0f)
                curveTo(11.7159f, 10.0f, 11.5259f, 10.3408f, 11.1459f, 11.0225f)
                lineTo(11.0476f, 11.1989f)
                lineTo(11.0476f, 11.1989f)
                curveTo(10.9397f, 11.3926f, 10.8857f, 11.4894f, 10.8015f, 11.5533f)
                curveTo(10.7173f, 11.6172f, 10.6125f, 11.641f, 10.4028f, 11.6884f)
                lineTo(10.2119f, 11.7316f)
                curveTo(9.474f, 11.8986f, 9.105f, 11.982f, 9.0172f, 12.2643f)
                curveTo(8.9295f, 12.5466f, 9.181f, 12.8407f, 9.684f, 13.429f)
                lineTo(9.8142f, 13.5812f)
                curveTo(9.9571f, 13.7483f, 10.0286f, 13.8319f, 10.0608f, 13.9353f)
                curveTo(10.0929f, 14.0387f, 10.0821f, 14.1502f, 10.0605f, 14.3733f)
                lineTo(10.0408f, 14.5763f)
                curveTo(9.9648f, 15.3612f, 9.9267f, 15.7536f, 10.1565f, 15.9281f)
                curveTo(10.3864f, 16.1025f, 10.7318f, 15.9435f, 11.4227f, 15.6254f)
                lineTo(11.6014f, 15.5431f)
                curveTo(11.7978f, 15.4527f, 11.8959f, 15.4075f, 12.0f, 15.4075f)
                curveTo(12.1041f, 15.4075f, 12.2022f, 15.4527f, 12.3986f, 15.5431f)
                lineTo(12.5773f, 15.6254f)
                lineTo(12.5773f, 15.6254f)
                curveTo(13.2682f, 15.9435f, 13.6136f, 16.1025f, 13.8435f, 15.9281f)
                curveTo(14.0733f, 15.7536f, 14.0352f, 15.3612f, 13.9592f, 14.5763f)
                lineTo(13.9395f, 14.3733f)
                curveTo(13.9179f, 14.1502f, 13.9071f, 14.0387f, 13.9392f, 13.9353f)
                curveTo(13.9714f, 13.8319f, 14.0429f, 13.7483f, 14.1858f, 13.5812f)
                lineTo(14.316f, 13.429f)
                curveTo(14.819f, 12.8407f, 15.0706f, 12.5466f, 14.9828f, 12.2643f)
                curveTo(14.895f, 11.982f, 14.526f, 11.8986f, 13.7881f, 11.7316f)
                lineTo(13.5972f, 11.6884f)
                curveTo(13.3875f, 11.641f, 13.2827f, 11.6172f, 13.1985f, 11.5533f)
                curveTo(13.1143f, 11.4894f, 13.0603f, 11.3926f, 12.9524f, 11.1989f)
                lineTo(12.9524f, 11.1989f)
                close()
            }
        }
            .build()
        return _folderFavouriteStar!!
    }

private var _folderFavouriteStar: ImageVector? = null
