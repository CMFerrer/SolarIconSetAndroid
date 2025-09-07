package com.chiksmedina.solar.outline.school

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.SchoolGroup

val SchoolGroup.SquareAcademicCap: ImageVector
    get() {
        if (_squareAcademicCap != null) {
            return _squareAcademicCap!!
        }
        _squareAcademicCap = Builder(
            name = "SquareAcademicCap", defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                pathFillType = EvenOdd
            ) {
                moveTo(9.4643f, 2.8206f)
                curveTo(11.0871f, 2.0598f, 12.9128f, 2.0598f, 14.5356f, 2.8206f)
                lineTo(21.2268f, 5.9576f)
                curveTo(22.2791f, 6.4509f, 22.75f, 7.5222f, 22.75f, 8.5f)
                curveTo(22.75f, 9.4778f, 22.2791f, 10.5491f, 21.2268f, 11.0425f)
                lineTo(19.75f, 11.7348f)
                verticalLineTo(16.6254f)
                curveTo(19.75f, 17.8785f, 19.1217f, 19.0883f, 17.978f, 19.7217f)
                curveTo(17.2263f, 20.138f, 16.2384f, 20.6391f, 15.1988f, 21.038f)
                curveTo(14.1715f, 21.4321f, 13.0339f, 21.75f, 12.0f, 21.75f)
                curveTo(10.9661f, 21.75f, 9.8285f, 21.4321f, 8.8012f, 21.038f)
                curveTo(7.7616f, 20.6391f, 6.7737f, 20.138f, 6.022f, 19.7217f)
                curveTo(4.8783f, 19.0883f, 4.25f, 17.8785f, 4.25f, 16.6254f)
                verticalLineTo(11.7348f)
                lineTo(2.7732f, 11.0424f)
                lineTo(2.75f, 11.0314f)
                verticalLineTo(14.0f)
                curveTo(2.75f, 14.4142f, 2.4142f, 14.75f, 2.0f, 14.75f)
                curveTo(1.5858f, 14.75f, 1.25f, 14.4142f, 1.25f, 14.0f)
                verticalLineTo(8.5f)
                curveTo(1.25f, 7.5222f, 1.721f, 6.4509f, 2.7732f, 5.9575f)
                lineTo(9.4643f, 2.8206f)
                close()
                moveTo(5.75f, 12.438f)
                verticalLineTo(16.6254f)
                curveTo(5.75f, 17.3884f, 6.1287f, 18.0661f, 6.7487f, 18.4095f)
                curveTo(7.4653f, 18.8063f, 8.3868f, 19.2724f, 9.3384f, 19.6375f)
                curveTo(10.3023f, 20.0073f, 11.2379f, 20.25f, 12.0f, 20.25f)
                curveTo(12.7621f, 20.25f, 13.6977f, 20.0073f, 14.6616f, 19.6375f)
                curveTo(15.6132f, 19.2724f, 16.5347f, 18.8063f, 17.2513f, 18.4095f)
                curveTo(17.8713f, 18.0661f, 18.25f, 17.3884f, 18.25f, 16.6254f)
                verticalLineTo(12.4381f)
                lineTo(14.5357f, 14.1794f)
                curveTo(12.9129f, 14.9402f, 11.0872f, 14.9402f, 9.4644f, 14.1794f)
                lineTo(5.75f, 12.438f)
                close()
                moveTo(3.41f, 9.6843f)
                curveTo(3.0068f, 9.4953f, 2.75f, 9.0444f, 2.75f, 8.5f)
                curveTo(2.75f, 7.9556f, 3.0068f, 7.5047f, 3.41f, 7.3157f)
                lineTo(10.1011f, 4.1787f)
                curveTo(11.3204f, 3.6071f, 12.6795f, 3.6071f, 13.8988f, 4.1787f)
                lineTo(20.59f, 7.3157f)
                curveTo(20.9932f, 7.5047f, 21.25f, 7.9556f, 21.25f, 8.5f)
                curveTo(21.25f, 9.0444f, 20.9932f, 9.4953f, 20.59f, 9.6843f)
                lineTo(13.8989f, 12.8213f)
                curveTo(12.6796f, 13.3929f, 11.3205f, 13.3929f, 10.1012f, 12.8213f)
                lineTo(3.41f, 9.6843f)
                close()
            }
        }
            .build()
        return _squareAcademicCap!!
    }

private var _squareAcademicCap: ImageVector? = null
