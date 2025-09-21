package dev.chiksmedina.solar.broken.videoaudiosound

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
import dev.chiksmedina.solar.broken.VideoAudioSoundGroup

val VideoAudioSoundGroup.Wallpaper: ImageVector
    get() {
        if (_wallpaper != null) {
            return _wallpaper!!
        }
        _wallpaper = Builder(
            name = "Wallpaper", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
            viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = NonZero
            ) {
                moveTo(18.25f, 15.0f)
                curveTo(18.25f, 15.4142f, 18.5858f, 15.75f, 19.0f, 15.75f)
                curveTo(19.4142f, 15.75f, 19.75f, 15.4142f, 19.75f, 15.0f)
                horizontalLineTo(18.25f)
                close()
                moveTo(11.0f, 2.75f)
                horizontalLineTo(13.0f)
                verticalLineTo(1.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(2.75f)
                close()
                moveTo(13.0f, 21.25f)
                horizontalLineTo(11.0f)
                verticalLineTo(22.75f)
                horizontalLineTo(13.0f)
                verticalLineTo(21.25f)
                close()
                moveTo(5.75f, 16.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(4.25f)
                verticalLineTo(16.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(11.0f, 21.25f)
                curveTo(9.5646f, 21.25f, 8.5635f, 21.2484f, 7.8081f, 21.1469f)
                curveTo(7.0743f, 21.0482f, 6.6858f, 20.8678f, 6.409f, 20.591f)
                lineTo(5.3484f, 21.6517f)
                curveTo(5.9503f, 22.2536f, 6.7081f, 22.5125f, 7.6083f, 22.6335f)
                curveTo(8.4868f, 22.7516f, 9.607f, 22.75f, 11.0f, 22.75f)
                verticalLineTo(21.25f)
                close()
                moveTo(4.25f, 16.0f)
                curveTo(4.25f, 17.393f, 4.2484f, 18.5132f, 4.3665f, 19.3918f)
                curveTo(4.4875f, 20.2919f, 4.7464f, 21.0497f, 5.3484f, 21.6517f)
                lineTo(6.409f, 20.591f)
                curveTo(6.1322f, 20.3142f, 5.9518f, 19.9257f, 5.8531f, 19.1919f)
                curveTo(5.7516f, 18.4365f, 5.75f, 17.4354f, 5.75f, 16.0f)
                horizontalLineTo(4.25f)
                close()
                moveTo(13.0f, 22.75f)
                curveTo(14.393f, 22.75f, 15.5132f, 22.7516f, 16.3918f, 22.6335f)
                curveTo(17.2919f, 22.5125f, 18.0497f, 22.2536f, 18.6517f, 21.6517f)
                lineTo(17.591f, 20.591f)
                curveTo(17.3142f, 20.8678f, 16.9257f, 21.0482f, 16.1919f, 21.1469f)
                curveTo(15.4365f, 21.2484f, 14.4354f, 21.25f, 13.0f, 21.25f)
                verticalLineTo(22.75f)
                close()
                moveTo(13.0f, 2.75f)
                curveTo(14.4354f, 2.75f, 15.4365f, 2.7516f, 16.1919f, 2.8531f)
                curveTo(16.9257f, 2.9518f, 17.3142f, 3.1323f, 17.591f, 3.409f)
                lineTo(18.6517f, 2.3484f)
                curveTo(18.0497f, 1.7464f, 17.2919f, 1.4875f, 16.3918f, 1.3665f)
                curveTo(15.5132f, 1.2484f, 14.393f, 1.25f, 13.0f, 1.25f)
                verticalLineTo(2.75f)
                close()
                moveTo(19.75f, 8.0f)
                curveTo(19.75f, 6.607f, 19.7516f, 5.4868f, 19.6335f, 4.6083f)
                curveTo(19.5125f, 3.7081f, 19.2536f, 2.9503f, 18.6517f, 2.3484f)
                lineTo(17.591f, 3.409f)
                curveTo(17.8678f, 3.6858f, 18.0482f, 4.0743f, 18.1469f, 4.8081f)
                curveTo(18.2484f, 5.5635f, 18.25f, 6.5646f, 18.25f, 8.0f)
                horizontalLineTo(19.75f)
                close()
                moveTo(11.0f, 1.25f)
                curveTo(9.607f, 1.25f, 8.4868f, 1.2484f, 7.6083f, 1.3665f)
                curveTo(6.7081f, 1.4875f, 5.9503f, 1.7464f, 5.3484f, 2.3484f)
                lineTo(6.409f, 3.409f)
                curveTo(6.6858f, 3.1323f, 7.0743f, 2.9518f, 7.8081f, 2.8531f)
                curveTo(8.5635f, 2.7516f, 9.5646f, 2.75f, 11.0f, 2.75f)
                verticalLineTo(1.25f)
                close()
                moveTo(5.75f, 8.0f)
                curveTo(5.75f, 6.5646f, 5.7516f, 5.5635f, 5.8531f, 4.8081f)
                curveTo(5.9518f, 4.0743f, 6.1322f, 3.6858f, 6.409f, 3.409f)
                lineTo(5.3484f, 2.3484f)
                curveTo(4.7464f, 2.9503f, 4.4875f, 3.7081f, 4.3665f, 4.6083f)
                curveTo(4.2484f, 5.4868f, 4.25f, 6.607f, 4.25f, 8.0f)
                horizontalLineTo(5.75f)
                close()
                moveTo(18.1717f, 18.9835f)
                curveTo(18.0801f, 19.8548f, 17.8926f, 20.2894f, 17.591f, 20.591f)
                lineTo(18.6517f, 21.6517f)
                curveTo(19.309f, 20.9943f, 19.5571f, 20.1512f, 19.6635f, 19.1404f)
                lineTo(18.1717f, 18.9835f)
                close()
                moveTo(18.25f, 8.0f)
                verticalLineTo(15.0f)
                horizontalLineTo(19.75f)
                verticalLineTo(8.0f)
                horizontalLineTo(18.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(19.0f, 19.5f)
                curveTo(19.4645f, 19.5f, 19.6968f, 19.5f, 19.8911f, 19.4692f)
                curveTo(20.9608f, 19.2998f, 21.7998f, 18.4608f, 21.9692f, 17.3911f)
                curveTo(22.0f, 17.1968f, 22.0f, 16.9645f, 22.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(22.0f, 7.0355f, 22.0f, 6.8032f, 21.9692f, 6.6089f)
                curveTo(21.7998f, 5.5392f, 20.9608f, 4.7002f, 19.8911f, 4.5308f)
                curveTo(19.6968f, 4.5f, 19.4645f, 4.5f, 19.0f, 4.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 19.5f)
                curveTo(4.5355f, 19.5f, 4.3032f, 19.5f, 4.1089f, 19.4692f)
                curveTo(3.0392f, 19.2998f, 2.2002f, 18.4608f, 2.0308f, 17.3911f)
                curveTo(2.0f, 17.1968f, 2.0f, 16.9645f, 2.0f, 16.5f)
                verticalLineTo(7.5f)
                curveTo(2.0f, 7.0355f, 2.0f, 6.8032f, 2.0308f, 6.6089f)
                curveTo(2.2002f, 5.5392f, 3.0392f, 4.7002f, 4.1089f, 4.5308f)
                curveTo(4.3032f, 4.5f, 4.5355f, 4.5f, 5.0f, 4.5f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(14.5f, 6.5f)
                moveToRelative(-1.5f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f)
                arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f)
            }
            path(
                fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                strokeLineMiter = 4.0f, pathFillType = NonZero
            ) {
                moveTo(5.0f, 14.8159f)
                lineTo(6.2906f, 13.4917f)
                curveTo(6.9621f, 12.8028f, 7.9741f, 12.8423f, 8.605f, 13.5821f)
                lineTo(11.7658f, 17.2884f)
                curveTo(12.2722f, 17.8822f, 13.0693f, 17.9632f, 13.6552f, 17.4804f)
                lineTo(13.875f, 17.2993f)
                curveTo(14.7181f, 16.6045f, 15.8588f, 16.685f, 16.6248f, 17.4933f)
                lineTo(19.0f, 19.5f)
            }
        }
            .build()
        return _wallpaper!!
    }

private var _wallpaper: ImageVector? = null
