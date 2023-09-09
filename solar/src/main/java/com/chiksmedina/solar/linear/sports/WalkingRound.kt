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

public val SportsGroup.WalkingRound: ImageVector
    get() {
        if (_walkingRound != null) {
            return _walkingRound!!
        }
        _walkingRound = Builder(name = "WalkingRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(12.5f, 4.5f)
                moveToRelative(-2.5f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, 5.0f, 0.0f)
                arcToRelative(2.5f, 2.5f, 0.0f, true, true, -5.0f, 0.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(7.0f, 22.0f)
                lineTo(7.5092f, 21.5927f)
                curveTo(8.7951f, 20.564f, 9.677f, 19.1148f, 10.0f, 17.5f)
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(11.1582f, 13.4177f)
                lineTo(11.9045f, 13.4923f)
                lineTo(11.9045f, 13.4923f)
                lineTo(11.1582f, 13.4177f)
                close()
                moveTo(11.9713f, 16.259f)
                lineTo(12.5652f, 15.8009f)
                lineTo(12.5652f, 15.8009f)
                lineTo(11.9713f, 16.259f)
                close()
                moveTo(15.8066f, 22.4581f)
                curveTo(16.0596f, 22.7861f, 16.5306f, 22.8468f, 16.8585f, 22.5938f)
                curveTo(17.1865f, 22.3408f, 17.2472f, 21.8698f, 16.9942f, 21.5419f)
                lineTo(15.8066f, 22.4581f)
                close()
                moveTo(10.9698f, 10.0161f)
                lineTo(10.9292f, 9.2672f)
                lineTo(10.9698f, 10.0161f)
                close()
                moveTo(13.0872f, 10.1315f)
                lineTo(12.9805f, 10.8739f)
                lineTo(12.9805f, 10.8739f)
                lineTo(13.0872f, 10.1315f)
                close()
                moveTo(17.1969f, 13.3005f)
                lineTo(17.0736f, 12.5607f)
                lineTo(17.0736f, 12.5607f)
                lineTo(17.1969f, 13.3005f)
                close()
                moveTo(19.1233f, 13.7398f)
                curveTo(19.5319f, 13.6717f, 19.8079f, 13.2853f, 19.7398f, 12.8767f)
                curveTo(19.6717f, 12.4681f, 19.2853f, 12.1921f, 18.8767f, 12.2602f)
                lineTo(19.1233f, 13.7398f)
                close()
                moveTo(15.6163f, 12.3488f)
                lineTo(16.3278f, 12.1117f)
                lineTo(16.3278f, 12.1117f)
                lineTo(15.6163f, 12.3488f)
                close()
                moveTo(6.25f, 14.5f)
                curveTo(6.25f, 14.9142f, 6.5858f, 15.25f, 7.0f, 15.25f)
                curveTo(7.4142f, 15.25f, 7.75f, 14.9142f, 7.75f, 14.5f)
                horizontalLineTo(6.25f)
                close()
                moveTo(10.7537f, 9.9254f)
                lineTo(10.412f, 13.3431f)
                lineTo(11.9045f, 13.4923f)
                lineTo(12.2463f, 10.0746f)
                lineTo(10.7537f, 9.9254f)
                close()
                moveTo(11.3775f, 16.7172f)
                lineTo(15.8066f, 22.4581f)
                lineTo(16.9942f, 21.5419f)
                lineTo(12.5652f, 15.8009f)
                lineTo(11.3775f, 16.7172f)
                close()
                moveTo(11.5f, 9.25f)
                curveTo(11.3217f, 9.25f, 11.129f, 9.2564f, 10.9292f, 9.2672f)
                lineTo(11.0104f, 10.765f)
                curveTo(11.1912f, 10.7552f, 11.3558f, 10.75f, 11.5f, 10.75f)
                verticalLineTo(9.25f)
                close()
                moveTo(11.5f, 10.75f)
                curveTo(11.9543f, 10.75f, 12.476f, 10.8014f, 12.9805f, 10.8739f)
                lineTo(13.1938f, 9.3891f)
                curveTo(12.6539f, 9.3116f, 12.0541f, 9.25f, 11.5f, 9.25f)
                verticalLineTo(10.75f)
                close()
                moveTo(17.3202f, 14.0403f)
                lineTo(19.1233f, 13.7398f)
                lineTo(18.8767f, 12.2602f)
                lineTo(17.0736f, 12.5607f)
                lineTo(17.3202f, 14.0403f)
                close()
                moveTo(12.9805f, 10.8739f)
                curveTo(13.8619f, 11.0005f, 14.5975f, 11.6642f, 14.9048f, 12.586f)
                lineTo(16.3278f, 12.1117f)
                curveTo(15.8674f, 10.7305f, 14.7153f, 9.6077f, 13.1938f, 9.3891f)
                lineTo(12.9805f, 10.8739f)
                close()
                moveTo(10.9292f, 9.2672f)
                curveTo(8.1638f, 9.4171f, 6.25f, 11.8593f, 6.25f, 14.5f)
                horizontalLineTo(7.75f)
                curveTo(7.75f, 12.5243f, 9.1661f, 10.8649f, 11.0104f, 10.765f)
                lineTo(10.9292f, 9.2672f)
                close()
                moveTo(14.9048f, 12.586f)
                curveTo(15.2424f, 13.599f, 16.2669f, 14.2159f, 17.3202f, 14.0403f)
                lineTo(17.0736f, 12.5607f)
                curveTo(16.7484f, 12.6149f, 16.4321f, 12.4245f, 16.3278f, 12.1117f)
                lineTo(14.9048f, 12.586f)
                close()
                moveTo(10.412f, 13.3431f)
                curveTo(10.3396f, 14.0663f, 10.2713f, 14.6261f, 10.4253f, 15.1645f)
                lineTo(11.8674f, 14.7518f)
                curveTo(11.8107f, 14.5537f, 11.8205f, 14.332f, 11.9045f, 13.4923f)
                lineTo(10.412f, 13.3431f)
                close()
                moveTo(12.5652f, 15.8009f)
                curveTo(12.0497f, 15.1328f, 11.9241f, 14.9498f, 11.8674f, 14.7518f)
                lineTo(10.4253f, 15.1645f)
                curveTo(10.5794f, 15.7028f, 10.9335f, 16.1417f, 11.3775f, 16.7172f)
                lineTo(12.5652f, 15.8009f)
                close()
            }
        }
        .build()
        return _walkingRound!!
    }

private var _walkingRound: ImageVector? = null
