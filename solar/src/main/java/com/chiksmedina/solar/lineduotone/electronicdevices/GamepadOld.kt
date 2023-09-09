package com.chiksmedina.solar.lineduotone.electronicdevices

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
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.lineduotone.ElectronicDevicesGroup

public val ElectronicDevicesGroup.GamepadOld: ImageVector
    get() {
        if (_gamepadOld != null) {
            return _gamepadOld!!
        }
        _gamepadOld = Builder(name = "GamepadOld", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            group {
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap
                        = Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(8.0f, 10.0f)
                    verticalLineTo(14.0f)
                    moveTo(6.0f, 12.0f)
                    lineTo(10.0f, 12.0f)
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f,
                        strokeAlpha = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(16.0f, 10.5f)
                    curveTo(16.0f, 11.0523f, 15.5523f, 11.5f, 15.0f, 11.5f)
                    curveTo(14.4477f, 11.5f, 14.0f, 11.0523f, 14.0f, 10.5f)
                    curveTo(14.0f, 9.9477f, 14.4477f, 9.5f, 15.0f, 9.5f)
                    curveTo(15.5523f, 9.5f, 16.0f, 9.9477f, 16.0f, 10.5f)
                    close()
                }
                path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.5f,
                        strokeAlpha = 0.5f, strokeLineWidth = 0.0f, strokeLineCap = Butt,
                        strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(18.0f, 13.5f)
                    curveTo(18.0f, 14.0523f, 17.5523f, 14.5f, 17.0f, 14.5f)
                    curveTo(16.4477f, 14.5f, 16.0f, 14.0523f, 16.0f, 13.5f)
                    curveTo(16.0f, 12.9477f, 16.4477f, 12.5f, 17.0f, 12.5f)
                    curveTo(17.5523f, 12.5f, 18.0f, 12.9477f, 18.0f, 13.5f)
                    close()
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        fillAlpha = 0.5f, strokeAlpha = 0.5f, strokeLineWidth = 1.5f, strokeLineCap
                        = Round, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType =
                        NonZero) {
                    moveTo(12.0f, 4.0f)
                    verticalLineTo(3.0f)
                    curveTo(12.0f, 2.4477f, 12.4477f, 2.0f, 13.0f, 2.0f)
                    horizontalLineTo(14.0f)
                    curveTo(14.5523f, 2.0f, 15.0f, 1.5523f, 15.0f, 1.0f)
                    verticalLineTo(0.0f)
                }
                path(fill = SolidColor(Color(0x00000000)), stroke = SolidColor(Color(0xFF000000)),
                        strokeLineWidth = 1.5f, strokeLineCap = Butt, strokeLineJoin = Miter,
                        strokeLineMiter = 4.0f, pathFillType = NonZero) {
                    moveTo(2.0f, 12.0f)
                    curveTo(2.0f, 9.1997f, 2.0f, 7.7996f, 2.545f, 6.7301f)
                    curveTo(3.0243f, 5.7892f, 3.7892f, 5.0243f, 4.7301f, 4.545f)
                    curveTo(5.7996f, 4.0f, 7.1997f, 4.0f, 10.0f, 4.0f)
                    horizontalLineTo(14.0f)
                    curveTo(16.8003f, 4.0f, 18.2004f, 4.0f, 19.27f, 4.545f)
                    curveTo(20.2108f, 5.0243f, 20.9757f, 5.7892f, 21.455f, 6.7301f)
                    curveTo(22.0f, 7.7996f, 22.0f, 9.1997f, 22.0f, 12.0f)
                    curveTo(22.0f, 14.8003f, 22.0f, 16.2004f, 21.455f, 17.27f)
                    curveTo(20.9757f, 18.2108f, 20.2108f, 18.9757f, 19.27f, 19.455f)
                    curveTo(18.2004f, 20.0f, 16.8003f, 20.0f, 14.0f, 20.0f)
                    horizontalLineTo(10.0f)
                    curveTo(7.1997f, 20.0f, 5.7996f, 20.0f, 4.7301f, 19.455f)
                    curveTo(3.7892f, 18.9757f, 3.0243f, 18.2108f, 2.545f, 17.27f)
                    curveTo(2.0f, 16.2004f, 2.0f, 14.8003f, 2.0f, 12.0f)
                    close()
                }
            }
        }
        .build()
        return _gamepadOld!!
    }

private var _gamepadOld: ImageVector? = null
