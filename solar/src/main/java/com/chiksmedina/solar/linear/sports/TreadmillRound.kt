package com.chiksmedina.solar.linear.sports

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
import com.chiksmedina.solar.linear.SportsGroup

public val SportsGroup.TreadmillRound: ImageVector
    get() {
        if (_treadmillRound != null) {
            return _treadmillRound!!
        }
        _treadmillRound = Builder(name = "TreadmillRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(15.0f, 4.0f)
                moveToRelative(-2.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(11.0f, 16.0001f)
                verticalLineTo(15.0263f)
                curveTo(11.0f, 14.9078f, 11.0f, 14.8486f, 10.9979f, 14.792f)
                curveTo(10.9672f, 13.9811f, 10.6095f, 13.2173f, 10.0062f, 12.6747f)
                curveTo(9.9641f, 12.6368f, 9.9185f, 12.5989f, 9.8275f, 12.523f)
                curveTo(9.6941f, 12.4118f, 9.6274f, 12.3563f, 9.5758f, 12.3066f)
                curveTo(8.8094f, 11.5689f, 8.7546f, 10.3604f, 9.451f, 9.5563f)
                curveTo(9.4979f, 9.5021f, 9.5593f, 9.4408f, 9.6821f, 9.318f)
                lineTo(10.0113f, 8.9887f)
                curveTo(10.9639f, 8.0362f, 10.6532f, 6.4229f, 9.415f, 5.8922f)
                curveTo(8.8418f, 5.6466f, 8.1846f, 5.6972f, 7.6558f, 6.0277f)
                lineTo(4.5f, 8.0001f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 15.5f)
                horizontalLineTo(3.3787f)
                curveTo(4.7369f, 15.5f, 6.0396f, 14.9604f, 7.0f, 14.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 10.0f)
                curveTo(13.4737f, 10.3246f, 14.5263f, 10.3246f, 15.5f, 10.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin =
                    StrokeJoin.Companion.Round, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(19.4888f, 22.0001f)
                horizontalLineTo(3.0868f)
                curveTo(2.4866f, 22.0001f, 2.0f, 21.5135f, 2.0f, 20.9133f)
                curveTo(2.0f, 20.3853f, 2.3794f, 19.9337f, 2.8995f, 19.8427f)
                lineTo(19.0559f, 17.0153f)
                curveTo(20.5926f, 16.7464f, 22.0f, 17.9289f, 22.0f, 19.4889f)
                curveTo(22.0f, 20.8758f, 20.8757f, 22.0001f, 19.4888f, 22.0001f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(19.1218f, 10.0213f)
                lineTo(18.3801f, 9.9101f)
                lineTo(19.1218f, 10.0213f)
                close()
                moveTo(22.1471f, 7.7354f)
                curveTo(22.5533f, 7.6542f, 22.8167f, 7.2591f, 22.7354f, 6.8529f)
                curveTo(22.6542f, 6.4467f, 22.2591f, 6.1833f, 21.8529f, 6.2646f)
                lineTo(22.1471f, 7.7354f)
                close()
                moveTo(18.7417f, 17.6113f)
                lineTo(19.8635f, 10.1326f)
                lineTo(18.3801f, 9.9101f)
                lineTo(17.2583f, 17.3887f)
                lineTo(18.7417f, 17.6113f)
                close()
                moveTo(19.8635f, 10.1326f)
                curveTo(20.0436f, 8.9322f, 20.9568f, 7.9735f, 22.1471f, 7.7354f)
                lineTo(21.8529f, 6.2646f)
                curveTo(20.0428f, 6.6266f, 18.6539f, 8.0845f, 18.3801f, 9.9101f)
                lineTo(19.8635f, 10.1326f)
                close()
            }
        }
        .build()
        return _treadmillRound!!
    }

private var _treadmillRound: ImageVector? = null
