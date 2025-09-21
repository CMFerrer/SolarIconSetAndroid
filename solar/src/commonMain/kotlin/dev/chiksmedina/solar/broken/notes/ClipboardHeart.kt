package dev.chiksmedina.solar.broken.notes

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
import dev.chiksmedina.solar.broken.NotesGroup

val NotesGroup.ClipboardHeart: ImageVector
    get() {
        if (_clipboardHeart != null) {
            return _clipboardHeart!!
        }
        _clipboardHeart = Builder(
            name = "ClipboardHeart", defaultWidth = 24.0.dp, defaultHeight =
            24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(12.0f, 11.6913f)
                lineTo(11.4813f, 12.2331f)
                curveTo(11.7713f, 12.5108f, 12.2287f, 12.5108f, 12.5187f, 12.2331f)
                lineTo(12.0f, 11.6913f)
                close()
                moveTo(12.0f, 15.8276f)
                lineTo(12.0f, 15.0776f)
                lineTo(12.0f, 15.8276f)
                close()
                moveTo(11.4865f, 14.7609f)
                curveTo(11.0686f, 14.4542f, 10.6081f, 14.0712f, 10.2595f, 13.6681f)
                curveTo(9.8912f, 13.2423f, 9.75f, 12.9113f, 9.75f, 12.6967f)
                horizontalLineTo(8.25f)
                curveTo(8.25f, 13.4666f, 8.6912f, 14.1479f, 9.1249f, 14.6493f)
                curveTo(9.5782f, 15.1735f, 10.1391f, 15.6327f, 10.5992f, 15.9703f)
                lineTo(11.4865f, 14.7609f)
                close()
                moveTo(9.75f, 12.6967f)
                curveTo(9.75f, 12.1207f, 10.0126f, 11.87f, 10.2419f, 11.7896f)
                curveTo(10.4922f, 11.7019f, 10.9558f, 11.7299f, 11.4813f, 12.2331f)
                lineTo(12.5187f, 11.1496f)
                curveTo(11.6943f, 10.3603f, 10.6579f, 10.0543f, 9.7457f, 10.3741f)
                curveTo(8.8125f, 10.7012f, 8.25f, 11.5995f, 8.25f, 12.6967f)
                horizontalLineTo(9.75f)
                close()
                moveTo(13.4008f, 15.9703f)
                curveTo(13.8609f, 15.6327f, 14.4218f, 15.1735f, 14.8751f, 14.6493f)
                curveTo(15.3088f, 14.1479f, 15.75f, 13.4666f, 15.75f, 12.6967f)
                horizontalLineTo(14.25f)
                curveTo(14.25f, 12.9113f, 14.1088f, 13.2423f, 13.7405f, 13.6681f)
                curveTo(13.3919f, 14.0713f, 12.9314f, 14.4542f, 12.5135f, 14.7609f)
                lineTo(13.4008f, 15.9703f)
                close()
                moveTo(15.75f, 12.6967f)
                curveTo(15.75f, 11.5995f, 15.1875f, 10.7012f, 14.2543f, 10.3741f)
                curveTo(13.3421f, 10.0543f, 12.3057f, 10.3603f, 11.4813f, 11.1496f)
                lineTo(12.5187f, 12.2331f)
                curveTo(13.0442f, 11.7299f, 13.5078f, 11.7019f, 13.7581f, 11.7896f)
                curveTo(13.9874f, 11.87f, 14.25f, 12.1207f, 14.25f, 12.6967f)
                horizontalLineTo(15.75f)
                close()
                moveTo(10.5992f, 15.9703f)
                curveTo(10.9678f, 16.2407f, 11.3816f, 16.5775f, 12.0f, 16.5776f)
                lineTo(12.0f, 15.0776f)
                curveTo(11.9756f, 15.0776f, 11.9605f, 15.0775f, 11.9061f, 15.0488f)
                curveTo(11.8202f, 15.0034f, 11.7128f, 14.9269f, 11.4865f, 14.7609f)
                lineTo(10.5992f, 15.9703f)
                close()
                moveTo(12.5135f, 14.7609f)
                curveTo(12.2872f, 14.9269f, 12.1798f, 15.0034f, 12.0939f, 15.0488f)
                curveTo(12.0395f, 15.0775f, 12.0244f, 15.0776f, 12.0f, 15.0776f)
                lineTo(12.0f, 16.5776f)
                curveTo(12.6184f, 16.5776f, 13.0322f, 16.2407f, 13.4008f, 15.9703f)
                lineTo(12.5135f, 14.7609f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(8.0f, 3.5f)
                curveTo(8.0f, 2.6716f, 8.6716f, 2.0f, 9.5f, 2.0f)
                horizontalLineTo(14.5f)
                curveTo(15.3284f, 2.0f, 16.0f, 2.6716f, 16.0f, 3.5f)
                verticalLineTo(4.5f)
                curveTo(16.0f, 5.3284f, 15.3284f, 6.0f, 14.5f, 6.0f)
                horizontalLineTo(9.5f)
                curveTo(8.6716f, 6.0f, 8.0f, 5.3284f, 8.0f, 4.5f)
                verticalLineTo(3.5f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 16.0002f)
                curveTo(21.0f, 18.8286f, 21.0f, 20.2429f, 20.1213f, 21.1215f)
                curveTo(19.2426f, 22.0002f, 17.8284f, 22.0002f, 15.0f, 22.0002f)
                horizontalLineTo(9.0f)
                curveTo(6.1716f, 22.0002f, 4.7574f, 22.0002f, 3.8787f, 21.1215f)
                curveTo(3.0f, 20.2429f, 3.0f, 18.8286f, 3.0f, 16.0002f)
                verticalLineTo(13.0002f)
                moveTo(16.0f, 4.0019f)
                curveTo(18.175f, 4.0141f, 19.3529f, 4.1105f, 20.1213f, 4.8789f)
                curveTo(21.0f, 5.7576f, 21.0f, 7.1718f, 21.0f, 10.0002f)
                verticalLineTo(12.0002f)
                moveTo(8.0f, 4.0019f)
                curveTo(5.825f, 4.0141f, 4.6471f, 4.1105f, 3.8787f, 4.8789f)
                curveTo(3.1103f, 5.6473f, 3.0138f, 6.8251f, 3.0017f, 9.0f)
            }
        }
            .build()
        return _clipboardHeart!!
    }

private var _clipboardHeart: ImageVector? = null
