package com.chiksmedina.solar.lineduotone.school

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
import com.chiksmedina.solar.lineduotone.SchoolGroup

public val SchoolGroup.CaseRound: ImageVector
    get() {
        if (_caseRound != null) {
            return _caseRound!!
        }
        _caseRound = Builder(name = "CaseRound", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.0f, 12.0f)
                curveTo(3.0f, 15.7712f, 3.0f, 19.6569f, 4.318f, 20.8284f)
                curveTo(5.636f, 22.0f, 7.7574f, 22.0f, 12.0f, 22.0f)
                curveTo(16.2426f, 22.0f, 18.364f, 22.0f, 19.682f, 20.8284f)
                curveTo(21.0f, 19.6569f, 21.0f, 15.7712f, 21.0f, 12.0f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.6603f, 14.2019f)
                lineTo(20.8579f, 12.3426f)
                curveTo(21.2688f, 12.2194f, 21.4743f, 12.1577f, 21.6264f, 12.0355f)
                curveTo(21.7592f, 11.9288f, 21.8626f, 11.7898f, 21.9266f, 11.6319f)
                curveTo(22.0f, 11.4511f, 22.0f, 11.2366f, 22.0f, 10.8077f)
                curveTo(22.0f, 9.1203f, 22.0f, 8.2766f, 21.6703f, 7.6327f)
                curveTo(21.3834f, 7.0724f, 20.9276f, 6.6166f, 20.3673f, 6.3297f)
                curveTo(19.7234f, 6.0f, 18.8797f, 6.0f, 17.1923f, 6.0f)
                horizontalLineTo(6.8077f)
                curveTo(5.1203f, 6.0f, 4.2766f, 6.0f, 3.6327f, 6.3297f)
                curveTo(3.0724f, 6.6166f, 2.6166f, 7.0724f, 2.3297f, 7.6327f)
                curveTo(2.0f, 8.2766f, 2.0f, 9.1203f, 2.0f, 10.8077f)
                curveTo(2.0f, 11.2366f, 2.0f, 11.4511f, 2.0734f, 11.6319f)
                curveTo(2.1374f, 11.7898f, 2.2408f, 11.9288f, 2.3736f, 12.0355f)
                curveTo(2.5257f, 12.1577f, 2.7312f, 12.2194f, 3.1421f, 12.3426f)
                lineTo(9.3397f, 14.2019f)
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    strokeLineWidth = 1.5f, strokeLineCap = Round, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(14.0f, 12.5f)
                horizontalLineTo(10.0f)
                curveTo(9.7239f, 12.5f, 9.5f, 12.7239f, 9.5f, 13.0f)
                verticalLineTo(15.1615f)
                curveTo(9.5f, 15.3659f, 9.6245f, 15.5498f, 9.8143f, 15.6257f)
                lineTo(10.5144f, 15.9058f)
                curveTo(11.4681f, 16.2872f, 12.5319f, 16.2872f, 13.4856f, 15.9058f)
                lineTo(14.1857f, 15.6257f)
                curveTo(14.3755f, 15.5498f, 14.5f, 15.3659f, 14.5f, 15.1615f)
                verticalLineTo(13.0f)
                curveTo(14.5f, 12.7239f, 14.2761f, 12.5f, 14.0f, 12.5f)
                close()
            }
            path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                    fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap =
                    Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.1709f, 4.0f)
                curveTo(9.5827f, 2.8348f, 10.694f, 2.0f, 12.0002f, 2.0f)
                curveTo(13.3064f, 2.0f, 14.4177f, 2.8348f, 14.8295f, 4.0f)
            }
        }
        .build()
        return _caseRound!!
    }

private var _caseRound: ImageVector? = null
