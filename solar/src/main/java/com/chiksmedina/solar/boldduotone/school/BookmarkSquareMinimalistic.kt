package com.chiksmedina.solar.boldduotone.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
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
import com.chiksmedina.solar.boldduotone.SchoolGroup

public val SchoolGroup.BookmarkSquareMinimalistic: ImageVector
    get() {
        if (_bookmarkSquareMinimalistic != null) {
            return _bookmarkSquareMinimalistic!!
        }
        _bookmarkSquareMinimalistic = Builder(name = "BookmarkSquareMinimalistic", defaultWidth =
                24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight =
                24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f, strokeAlpha
                    = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(3.4645f, 20.5356f)
                curveTo(4.9289f, 22.0001f, 7.286f, 22.0001f, 12.0f, 22.0001f)
                curveTo(16.714f, 22.0001f, 19.0711f, 22.0001f, 20.5355f, 20.5356f)
                curveTo(22.0f, 19.0711f, 22.0f, 16.714f, 22.0f, 12.0f)
                curveTo(22.0f, 7.286f, 22.0f, 4.9289f, 20.5355f, 3.4645f)
                curveTo(19.0711f, 2.0f, 16.714f, 2.0f, 12.0f, 2.0f)
                curveTo(7.286f, 2.0f, 4.9289f, 2.0f, 3.4645f, 3.4645f)
                curveTo(2.0f, 4.9289f, 2.0f, 7.286f, 2.0f, 12.0001f)
                curveTo(2.0f, 16.7141f, 2.0f, 19.0711f, 3.4645f, 20.5356f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(7.7649f, 9.8976f)
                curveTo(7.7503f, 9.6442f, 7.75f, 9.3043f, 7.75f, 8.8076f)
                verticalLineTo(2.0687f)
                curveTo(8.9058f, 2.0f, 10.2996f, 2.0f, 12.0f, 2.0f)
                curveTo(13.7004f, 2.0f, 15.0942f, 2.0f, 16.25f, 2.0687f)
                verticalLineTo(8.8076f)
                curveTo(16.25f, 9.3043f, 16.2497f, 9.6442f, 16.2351f, 9.8976f)
                curveTo(16.22f, 10.1601f, 16.1923f, 10.2408f, 16.1854f, 10.2563f)
                curveTo(16.0383f, 10.5876f, 15.6753f, 10.7662f, 15.323f, 10.6807f)
                curveTo(15.3066f, 10.6767f, 15.2257f, 10.6493f, 15.0085f, 10.5012f)
                curveTo(14.7989f, 10.3582f, 14.5294f, 10.151f, 14.1358f, 9.848f)
                lineTo(14.0688f, 9.7964f)
                curveTo(13.6986f, 9.5109f, 13.4101f, 9.2885f, 13.0958f, 9.152f)
                curveTo(12.3968f, 8.8483f, 11.6032f, 8.8483f, 10.9042f, 9.152f)
                curveTo(10.5899f, 9.2885f, 10.3014f, 9.5109f, 9.9312f, 9.7964f)
                lineTo(9.8642f, 9.848f)
                curveTo(9.4706f, 10.151f, 9.2011f, 10.3582f, 8.9915f, 10.5012f)
                curveTo(8.7743f, 10.6493f, 8.6934f, 10.6767f, 8.677f, 10.6807f)
                curveTo(8.3247f, 10.7662f, 7.9617f, 10.5876f, 7.8146f, 10.2563f)
                curveTo(7.8077f, 10.2408f, 7.78f, 10.1601f, 7.7649f, 9.8976f)
                close()
            }
        }
        .build()
        return _bookmarkSquareMinimalistic!!
    }

private var _bookmarkSquareMinimalistic: ImageVector? = null
