package com.chiksmedina.solar.outline.designtools

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.EvenOdd
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.chiksmedina.solar.outline.DesignToolsGroup

public val DesignToolsGroup.AlignLeft: ImageVector
    get() {
        if (_alignLeft != null) {
            return _alignLeft!!
        }
        _alignLeft = Builder(name = "AlignLeft", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = EvenOdd) {
                moveTo(3.0f, 1.25f)
                curveTo(3.4142f, 1.25f, 3.75f, 1.5858f, 3.75f, 2.0f)
                verticalLineTo(22.0f)
                curveTo(3.75f, 22.4142f, 3.4142f, 22.75f, 3.0f, 22.75f)
                curveTo(2.5858f, 22.75f, 2.25f, 22.4142f, 2.25f, 22.0f)
                verticalLineTo(2.0f)
                curveTo(2.25f, 1.5858f, 2.5858f, 1.25f, 3.0f, 1.25f)
                close()
                moveTo(9.4678f, 4.25f)
                horizontalLineTo(18.5322f)
                curveTo(18.972f, 4.25f, 19.3514f, 4.25f, 19.6626f, 4.2782f)
                curveTo(19.9918f, 4.308f, 20.3178f, 4.3741f, 20.625f, 4.5514f)
                curveTo(20.967f, 4.7489f, 21.2511f, 5.033f, 21.4486f, 5.375f)
                curveTo(21.6259f, 5.6822f, 21.692f, 6.0082f, 21.7218f, 6.3373f)
                curveTo(21.75f, 6.6486f, 21.75f, 7.028f, 21.75f, 7.4678f)
                verticalLineTo(7.5322f)
                curveTo(21.75f, 7.972f, 21.75f, 8.3514f, 21.7218f, 8.6627f)
                curveTo(21.692f, 8.9918f, 21.6259f, 9.3178f, 21.4486f, 9.625f)
                curveTo(21.2511f, 9.967f, 20.967f, 10.2511f, 20.625f, 10.4486f)
                curveTo(20.3178f, 10.6259f, 19.9918f, 10.692f, 19.6626f, 10.7218f)
                curveTo(19.3514f, 10.75f, 18.972f, 10.75f, 18.5322f, 10.75f)
                horizontalLineTo(9.4678f)
                curveTo(9.028f, 10.75f, 8.6487f, 10.75f, 8.3373f, 10.7218f)
                curveTo(8.0082f, 10.692f, 7.6822f, 10.6259f, 7.375f, 10.4486f)
                curveTo(7.033f, 10.2511f, 6.7489f, 9.967f, 6.5514f, 9.625f)
                curveTo(6.3741f, 9.3178f, 6.308f, 8.9918f, 6.2782f, 8.6627f)
                curveTo(6.25f, 8.3514f, 6.25f, 7.972f, 6.25f, 7.5322f)
                verticalLineTo(7.4678f)
                curveTo(6.25f, 7.028f, 6.25f, 6.6486f, 6.2782f, 6.3373f)
                curveTo(6.308f, 6.0082f, 6.3741f, 5.6822f, 6.5514f, 5.375f)
                curveTo(6.7489f, 5.033f, 7.033f, 4.7489f, 7.375f, 4.5514f)
                curveTo(7.6822f, 4.3741f, 8.0082f, 4.308f, 8.3373f, 4.2782f)
                curveTo(8.6486f, 4.25f, 9.028f, 4.25f, 9.4678f, 4.25f)
                close()
                moveTo(8.4727f, 5.7721f)
                curveTo(8.2476f, 5.7925f, 8.1659f, 5.8269f, 8.125f, 5.8505f)
                curveTo(8.011f, 5.9163f, 7.9163f, 6.011f, 7.8505f, 6.125f)
                curveTo(7.8269f, 6.1659f, 7.7925f, 6.2476f, 7.7721f, 6.4728f)
                curveTo(7.7507f, 6.7082f, 7.75f, 7.0189f, 7.75f, 7.5f)
                curveTo(7.75f, 7.9811f, 7.7507f, 8.2918f, 7.7721f, 8.5273f)
                curveTo(7.7925f, 8.7524f, 7.8269f, 8.8341f, 7.8505f, 8.875f)
                curveTo(7.9163f, 8.989f, 8.011f, 9.0837f, 8.125f, 9.1495f)
                curveTo(8.1659f, 9.1731f, 8.2476f, 9.2075f, 8.4727f, 9.2279f)
                curveTo(8.7082f, 9.2493f, 9.0189f, 9.25f, 9.5f, 9.25f)
                horizontalLineTo(18.5f)
                curveTo(18.9811f, 9.25f, 19.2918f, 9.2493f, 19.5273f, 9.2279f)
                curveTo(19.7524f, 9.2075f, 19.8341f, 9.1731f, 19.875f, 9.1495f)
                curveTo(19.989f, 9.0837f, 20.0837f, 8.989f, 20.1495f, 8.875f)
                curveTo(20.1731f, 8.8341f, 20.2075f, 8.7524f, 20.2279f, 8.5273f)
                curveTo(20.2493f, 8.2918f, 20.25f, 7.9811f, 20.25f, 7.5f)
                curveTo(20.25f, 7.0189f, 20.2493f, 6.7082f, 20.2279f, 6.4728f)
                curveTo(20.2075f, 6.2476f, 20.1731f, 6.1659f, 20.1495f, 6.125f)
                curveTo(20.0837f, 6.011f, 19.989f, 5.9163f, 19.875f, 5.8505f)
                curveTo(19.8341f, 5.8269f, 19.7524f, 5.7925f, 19.5273f, 5.7721f)
                curveTo(19.2918f, 5.7507f, 18.9811f, 5.75f, 18.5f, 5.75f)
                horizontalLineTo(9.5f)
                curveTo(9.0189f, 5.75f, 8.7082f, 5.7507f, 8.4727f, 5.7721f)
                close()
                moveTo(9.4678f, 13.25f)
                horizontalLineTo(15.5322f)
                curveTo(15.972f, 13.25f, 16.3514f, 13.25f, 16.6627f, 13.2782f)
                curveTo(16.9918f, 13.308f, 17.3178f, 13.3741f, 17.625f, 13.5514f)
                curveTo(17.967f, 13.7489f, 18.2511f, 14.033f, 18.4486f, 14.375f)
                curveTo(18.6259f, 14.6822f, 18.692f, 15.0082f, 18.7218f, 15.3373f)
                curveTo(18.75f, 15.6486f, 18.75f, 16.028f, 18.75f, 16.4678f)
                verticalLineTo(16.5322f)
                curveTo(18.75f, 16.972f, 18.75f, 17.3514f, 18.7218f, 17.6627f)
                curveTo(18.692f, 17.9918f, 18.6259f, 18.3178f, 18.4486f, 18.625f)
                curveTo(18.2511f, 18.967f, 17.967f, 19.2511f, 17.625f, 19.4486f)
                curveTo(17.3178f, 19.6259f, 16.9918f, 19.692f, 16.6627f, 19.7218f)
                curveTo(16.3514f, 19.75f, 15.972f, 19.75f, 15.5322f, 19.75f)
                horizontalLineTo(9.4677f)
                curveTo(9.028f, 19.75f, 8.6486f, 19.75f, 8.3373f, 19.7218f)
                curveTo(8.0082f, 19.692f, 7.6822f, 19.6259f, 7.375f, 19.4486f)
                curveTo(7.033f, 19.2511f, 6.7489f, 18.967f, 6.5514f, 18.625f)
                curveTo(6.3741f, 18.3178f, 6.308f, 17.9918f, 6.2782f, 17.6627f)
                curveTo(6.25f, 17.3514f, 6.25f, 16.972f, 6.25f, 16.5322f)
                verticalLineTo(16.4678f)
                curveTo(6.25f, 16.028f, 6.25f, 15.6486f, 6.2782f, 15.3373f)
                curveTo(6.308f, 15.0082f, 6.3741f, 14.6822f, 6.5514f, 14.375f)
                curveTo(6.7489f, 14.033f, 7.033f, 13.7489f, 7.375f, 13.5514f)
                curveTo(7.6822f, 13.3741f, 8.0082f, 13.308f, 8.3373f, 13.2782f)
                curveTo(8.6487f, 13.25f, 9.028f, 13.25f, 9.4678f, 13.25f)
                close()
                moveTo(8.4727f, 14.7721f)
                curveTo(8.2476f, 14.7925f, 8.1659f, 14.8269f, 8.125f, 14.8505f)
                curveTo(8.011f, 14.9163f, 7.9163f, 15.011f, 7.8505f, 15.125f)
                curveTo(7.8269f, 15.1659f, 7.7925f, 15.2476f, 7.7721f, 15.4727f)
                curveTo(7.7507f, 15.7082f, 7.75f, 16.0189f, 7.75f, 16.5f)
                curveTo(7.75f, 16.9811f, 7.7507f, 17.2918f, 7.7721f, 17.5273f)
                curveTo(7.7925f, 17.7524f, 7.8269f, 17.8341f, 7.8505f, 17.875f)
                curveTo(7.9163f, 17.989f, 8.011f, 18.0837f, 8.125f, 18.1495f)
                curveTo(8.1659f, 18.1731f, 8.2476f, 18.2075f, 8.4727f, 18.2279f)
                curveTo(8.7082f, 18.2493f, 9.0189f, 18.25f, 9.5f, 18.25f)
                horizontalLineTo(15.5f)
                curveTo(15.9811f, 18.25f, 16.2918f, 18.2493f, 16.5273f, 18.2279f)
                curveTo(16.7524f, 18.2075f, 16.8341f, 18.1731f, 16.875f, 18.1495f)
                curveTo(16.989f, 18.0837f, 17.0837f, 17.989f, 17.1495f, 17.875f)
                curveTo(17.1731f, 17.8341f, 17.2075f, 17.7524f, 17.2279f, 17.5273f)
                curveTo(17.2493f, 17.2918f, 17.25f, 16.9811f, 17.25f, 16.5f)
                curveTo(17.25f, 16.0189f, 17.2493f, 15.7082f, 17.2279f, 15.4727f)
                curveTo(17.2075f, 15.2476f, 17.1731f, 15.1659f, 17.1495f, 15.125f)
                curveTo(17.0837f, 15.011f, 16.989f, 14.9163f, 16.875f, 14.8505f)
                curveTo(16.8341f, 14.8269f, 16.7524f, 14.7925f, 16.5273f, 14.7721f)
                curveTo(16.2918f, 14.7507f, 15.9811f, 14.75f, 15.5f, 14.75f)
                horizontalLineTo(9.5f)
                curveTo(9.0189f, 14.75f, 8.7082f, 14.7507f, 8.4727f, 14.7721f)
                close()
            }
        }
        .build()
        return _alignLeft!!
    }

private var _alignLeft: ImageVector? = null
