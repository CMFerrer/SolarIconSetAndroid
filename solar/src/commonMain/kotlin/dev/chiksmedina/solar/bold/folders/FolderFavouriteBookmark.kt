package dev.chiksmedina.solar.bold.folders

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import dev.chiksmedina.solar.bold.FoldersGroup

val FoldersGroup.FolderFavouriteBookmark: ImageVector
    get() {
        if (_folderFavouriteBookmark != null) {
            return _folderFavouriteBookmark!!
        }
        _folderFavouriteBookmark = Builder(
            name = "FolderFavouriteBookmark", defaultWidth =
            24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
            24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(14.75f, 5.75f)
                horizontalLineTo(16.2021f)
                curveTo(16.5773f, 5.75f, 16.9258f, 5.75f, 17.25f, 5.7522f)
                verticalLineTo(10.6189f)
                lineTo(16.5448f, 10.2248f)
                lineTo(16.5361f, 10.22f)
                curveTo(16.5017f, 10.2007f, 16.4388f, 10.1654f, 16.3765f, 10.138f)
                curveTo(16.2946f, 10.1019f, 16.1649f, 10.056f, 16.0f, 10.056f)
                curveTo(15.8351f, 10.056f, 15.7054f, 10.1019f, 15.6235f, 10.138f)
                curveTo(15.5612f, 10.1654f, 15.4983f, 10.2007f, 15.4639f, 10.22f)
                lineTo(15.4552f, 10.2248f)
                lineTo(14.75f, 10.6189f)
                verticalLineTo(5.75f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(22.0f, 11.5479f)
                verticalLineTo(13.75f)
                curveTo(22.0f, 17.5212f, 22.0f, 19.4069f, 20.8284f, 20.5784f)
                curveTo(19.6569f, 21.75f, 17.7712f, 21.75f, 14.0f, 21.75f)
                horizontalLineTo(10.0f)
                curveTo(6.2288f, 21.75f, 4.3432f, 21.75f, 3.1716f, 20.5784f)
                curveTo(2.0f, 19.4069f, 2.0f, 17.5212f, 2.0f, 13.75f)
                verticalLineTo(6.6997f)
                curveTo(2.0f, 5.8172f, 2.0f, 5.3759f, 2.0694f, 5.0084f)
                curveTo(2.3746f, 3.3903f, 3.6403f, 2.1246f, 5.2584f, 1.8194f)
                curveTo(5.6259f, 1.75f, 6.0672f, 1.75f, 6.9497f, 1.75f)
                curveTo(7.3364f, 1.75f, 7.5298f, 1.75f, 7.7156f, 1.7674f)
                curveTo(8.5167f, 1.8423f, 9.2765f, 2.157f, 9.8959f, 2.6705f)
                curveTo(10.0396f, 2.7896f, 10.1763f, 2.9263f, 10.4497f, 3.1997f)
                lineTo(11.0f, 3.75f)
                curveTo(11.8158f, 4.5658f, 12.2237f, 4.9737f, 12.7121f, 5.2454f)
                curveTo(12.8851f, 5.3417f, 13.0649f, 5.4249f, 13.25f, 5.4944f)
                verticalLineTo(5.75f)
                verticalLineTo(11.1739f)
                lineTo(13.25f, 11.2029f)
                curveTo(13.2499f, 11.338f, 13.2498f, 11.5053f, 13.2684f, 11.6456f)
                curveTo(13.2878f, 11.7914f, 13.3512f, 12.1235f, 13.6686f, 12.3428f)
                curveTo(14.0156f, 12.5825f, 14.371f, 12.4922f, 14.5327f, 12.433f)
                curveTo(14.6682f, 12.3835f, 14.8147f, 12.3014f, 14.9195f, 12.2426f)
                lineTo(14.9448f, 12.2284f)
                lineTo(16.0f, 11.6387f)
                lineTo(17.0552f, 12.2284f)
                lineTo(17.0805f, 12.2426f)
                curveTo(17.1853f, 12.3014f, 17.3318f, 12.3835f, 17.4673f, 12.433f)
                curveTo(17.629f, 12.4922f, 17.9844f, 12.5825f, 18.3314f, 12.3428f)
                curveTo(18.6488f, 12.1235f, 18.7122f, 11.7914f, 18.7316f, 11.6456f)
                curveTo(18.7502f, 11.5053f, 18.7501f, 11.338f, 18.75f, 11.2029f)
                lineTo(18.75f, 11.1739f)
                verticalLineTo(5.7969f)
                curveTo(19.7988f, 5.8691f, 20.4872f, 6.0527f, 21.0062f, 6.5195f)
                curveTo(21.0849f, 6.5902f, 21.1598f, 6.6651f, 21.2305f, 6.7438f)
                curveTo(22.0f, 7.5993f, 22.0f, 8.9155f, 22.0f, 11.5479f)
                close()
            }
        }
            .build()
        return _folderFavouriteBookmark!!
    }

private var _folderFavouriteBookmark: ImageVector? = null
