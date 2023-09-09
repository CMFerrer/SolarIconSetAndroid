package com.chiksmedina.solar.bold.sports

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
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
import com.chiksmedina.solar.bold.SportsGroup

public val SportsGroup.WalkingRound: ImageVector
    get() {
        if (_walkingRound != null) {
            return _walkingRound!!
        }
        _walkingRound = Builder(name = "WalkingRound", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(15.0f, 4.5f)
                curveTo(15.0f, 5.8807f, 13.8807f, 7.0f, 12.5f, 7.0f)
                curveTo(11.1193f, 7.0f, 10.0f, 5.8807f, 10.0f, 4.5f)
                curveTo(10.0f, 3.1193f, 11.1193f, 2.0f, 12.5f, 2.0f)
                curveTo(13.8807f, 2.0f, 15.0f, 3.1193f, 15.0f, 4.5f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(10.9292f, 9.2672f)
                curveTo(11.129f, 9.2564f, 11.3217f, 9.25f, 11.5f, 9.25f)
                curveTo(12.0541f, 9.25f, 12.6539f, 9.3116f, 13.1938f, 9.3891f)
                curveTo(14.7154f, 9.6077f, 15.8674f, 10.7305f, 16.3278f, 12.1117f)
                curveTo(16.4321f, 12.4245f, 16.7484f, 12.6149f, 17.0737f, 12.5607f)
                lineTo(18.8767f, 12.2602f)
                curveTo(19.2853f, 12.1921f, 19.6717f, 12.4681f, 19.7398f, 12.8767f)
                curveTo(19.8079f, 13.2853f, 19.5319f, 13.6717f, 19.1233f, 13.7398f)
                lineTo(17.3203f, 14.0403f)
                curveTo(16.2669f, 14.2159f, 15.2425f, 13.599f, 14.9048f, 12.586f)
                curveTo(14.5975f, 11.6642f, 13.862f, 11.0005f, 12.9806f, 10.8739f)
                curveTo(12.7129f, 10.8354f, 12.4404f, 10.8029f, 12.1757f, 10.7809f)
                lineTo(11.9045f, 13.4923f)
                curveTo(11.8206f, 14.332f, 11.8108f, 14.5537f, 11.8675f, 14.7518f)
                curveTo(11.9241f, 14.9498f, 12.0497f, 15.1328f, 12.5652f, 15.8009f)
                lineTo(16.9942f, 21.5419f)
                curveTo(17.2473f, 21.8698f, 17.1865f, 22.3408f, 16.8585f, 22.5938f)
                curveTo(16.5306f, 22.8468f, 16.0596f, 22.7861f, 15.8066f, 22.4581f)
                lineTo(11.3775f, 16.7172f)
                curveTo(11.3536f, 16.6862f, 11.33f, 16.6556f, 11.3066f, 16.6254f)
                curveTo(10.896f, 16.0941f, 10.5711f, 15.6738f, 10.4253f, 15.1645f)
                curveTo(10.2796f, 14.6551f, 10.3329f, 14.1265f, 10.4004f, 13.4585f)
                curveTo(10.4042f, 13.4205f, 10.4081f, 13.382f, 10.412f, 13.3431f)
                lineTo(10.6661f, 10.8023f)
                curveTo(8.9927f, 11.076f, 7.75f, 12.6491f, 7.75f, 14.5f)
                curveTo(7.75f, 14.9142f, 7.4142f, 15.25f, 7.0f, 15.25f)
                curveTo(6.5858f, 15.25f, 6.25f, 14.9142f, 6.25f, 14.5f)
                curveTo(6.25f, 11.8593f, 8.1638f, 9.4171f, 10.9292f, 9.2672f)
                close()
                moveTo(10.1471f, 16.7646f)
                curveTo(10.5533f, 16.8458f, 10.8167f, 17.2409f, 10.7355f, 17.6471f)
                curveTo(10.3779f, 19.4349f, 9.4014f, 21.0394f, 7.9777f, 22.1783f)
                lineTo(7.4686f, 22.5857f)
                curveTo(7.1451f, 22.8444f, 6.6731f, 22.792f, 6.4144f, 22.4685f)
                curveTo(6.1556f, 22.1451f, 6.2081f, 21.6731f, 6.5315f, 21.4143f)
                lineTo(7.0407f, 21.007f)
                curveTo(8.1888f, 20.0885f, 8.9762f, 18.7946f, 9.2646f, 17.3529f)
                curveTo(9.3458f, 16.9467f, 9.7409f, 16.6833f, 10.1471f, 16.7646f)
                close()
            }
        }
        .build()
        return _walkingRound!!
    }

private var _walkingRound: ImageVector? = null
