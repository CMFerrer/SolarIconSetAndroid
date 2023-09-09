package com.chiksmedina.solar.lineduotone.videoaudiosound

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeCap.Companion.Round
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.VideoAudioSoundGroup

public val VideoAudioSoundGroup.UploadTrack: ImageVector
    get() {
        if (_uploadTrack != null) {
            return _uploadTrack!!
        }
        _uploadTrack = Builder(name = "UploadTrack", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                curveTo(12.0f, 16.1046f, 11.1046f, 17.0f, 10.0f, 17.0f)
                curveTo(8.8954f, 17.0f, 8.0f, 16.1046f, 8.0f, 15.0f)
                curveTo(8.0f, 13.8954f, 8.8954f, 13.0f, 10.0f, 13.0f)
                curveTo(11.1046f, 13.0f, 12.0f, 13.8954f, 12.0f, 15.0f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 15.0f)
                verticalLineTo(9.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0584f, 11.0294f)
                lineTo(12.7416f, 10.371f)
                curveTo(12.5592f, 10.2798f, 12.468f, 10.2342f, 12.3926f, 10.1765f)
                curveTo(12.1974f, 10.0273f, 12.064f, 9.8115f, 12.0178f, 9.5701f)
                curveTo(12.0f, 9.477f, 12.0f, 9.375f, 12.0f, 9.171f)
                curveTo(12.0f, 8.6854f, 12.0f, 8.4427f, 12.0598f, 8.2776f)
                curveTo(12.2178f, 7.8414f, 12.6551f, 7.5712f, 13.1159f, 7.6249f)
                curveTo(13.2902f, 7.6453f, 13.5074f, 7.7538f, 13.9416f, 7.971f)
                lineTo(15.2584f, 8.6294f)
                curveTo(15.4408f, 8.7206f, 15.532f, 8.7662f, 15.6074f, 8.8238f)
                curveTo(15.8026f, 8.973f, 15.936f, 9.1889f, 15.9822f, 9.4302f)
                curveTo(16.0f, 9.5234f, 16.0f, 9.6254f, 16.0f, 9.8294f)
                curveTo(16.0f, 10.3149f, 16.0f, 10.5577f, 15.9402f, 10.7227f)
                curveTo(15.7822f, 11.1589f, 15.3449f, 11.4292f, 14.8841f, 11.3754f)
                curveTo(14.7098f, 11.3551f, 14.4926f, 11.2465f, 14.0584f, 11.0294f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(18.0f, 22.0f)
                verticalLineTo(15.0f)
                moveTo(18.0f, 15.0f)
                lineTo(20.5f, 17.5f)
                moveTo(18.0f, 15.0f)
                lineTo(15.5f, 17.5f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.0f, 12.0f)
                moveToRelative(-10.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, 20.0f, 0.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -20.0f, 0.0f)
            }
        }
        .build()
        return _uploadTrack!!
    }

private var _uploadTrack: ImageVector? = null
