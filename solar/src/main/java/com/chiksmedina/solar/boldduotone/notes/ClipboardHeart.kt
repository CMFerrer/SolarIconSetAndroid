package com.chiksmedina.solar.boldduotone.notes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.boldduotone.NotesGroup

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
                fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(21.0f, 15.9983f)
                verticalLineTo(9.9983f)
                curveTo(21.0f, 7.1698f, 21.0f, 5.7556f, 20.1213f, 4.8769f)
                curveTo(19.3529f, 4.1086f, 18.175f, 4.0121f, 16.0f, 4.0f)
                horizontalLineTo(8.0f)
                curveTo(5.825f, 4.0121f, 4.6471f, 4.1086f, 3.8787f, 4.8769f)
                curveTo(3.0f, 5.7556f, 3.0f, 7.1698f, 3.0f, 9.9983f)
                verticalLineTo(15.9983f)
                curveTo(3.0f, 18.8267f, 3.0f, 20.2409f, 3.8787f, 21.1196f)
                curveTo(4.7574f, 21.9983f, 6.1716f, 21.9983f, 9.0f, 21.9983f)
                horizontalLineTo(15.0f)
                curveTo(17.8284f, 21.9983f, 19.2426f, 21.9983f, 20.1213f, 21.1196f)
                curveTo(21.0f, 20.2409f, 21.0f, 18.8267f, 21.0f, 15.9983f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
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
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(9.0f, 12.6967f)
                curveTo(9.0f, 13.6812f, 10.1649f, 14.7213f, 11.0429f, 15.3656f)
                curveTo(11.4626f, 15.6736f, 11.6725f, 15.8276f, 12.0f, 15.8276f)
                curveTo(12.3275f, 15.8276f, 12.5374f, 15.6736f, 12.9571f, 15.3656f)
                curveTo(13.8352f, 14.7214f, 15.0f, 13.6812f, 15.0f, 12.6967f)
                curveTo(15.0f, 11.0235f, 13.35f, 10.3988f, 12.0f, 11.6913f)
                curveTo(10.65f, 10.3988f, 9.0f, 11.0235f, 9.0f, 12.6967f)
                close()
            }
        }
            .build()
        return _clipboardHeart!!
    }

private var _clipboardHeart: ImageVector? = null
